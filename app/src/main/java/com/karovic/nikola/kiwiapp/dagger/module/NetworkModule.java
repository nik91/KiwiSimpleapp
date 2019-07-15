package com.karovic.nikola.kiwiapp.dagger.module;

import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grapesnberries.curllogger.CurlLoggerInterceptor;
import com.karovic.nikola.kiwiapp.BuildConfig;
import com.karovic.nikola.kiwiapp.rest.api.FlightsAPI;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @Named("apiUrl")
    String provideApiURL() {
        return BuildConfig.API_URL + "/";
    }

    @Provides
    @Named("imagesUrl")
    String provideImagesURL() {
        return BuildConfig.IMAGES_URL + "/";
    }

    @Provides
    @Singleton
    Cache provideHttpCache(Context context) {
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(context.getApplicationContext().getCacheDir(), cacheSize);
    }


    @Provides
    @Singleton
    HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return logging;
    }

    @Provides
    @Singleton
    CurlLoggerInterceptor provideCurlLoggerInterceptor() {
        return new CurlLoggerInterceptor();
    }


    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient(Cache cache, HttpLoggingInterceptor loggingInterceptor, CurlLoggerInterceptor curlInterceptor) {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.cache(cache).addInterceptor(loggingInterceptor);
        if (BuildConfig.DEBUG) {
            client.addInterceptor(curlInterceptor);
        }
        client.connectTimeout(60, TimeUnit.SECONDS);
        client.readTimeout(60, TimeUnit.SECONDS);
        client.writeTimeout(60, TimeUnit.SECONDS);
        return client.build();
    }

    @Provides
    @Reusable
    Retrofit provideRetrofit(@Named("apiUrl") String apiUrl, OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create(new ObjectMapper()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(apiUrl)
                .client(okHttpClient)
                .build();
    }


    @Provides
    @Reusable
    FlightsAPI provideFlightsAPI(Retrofit retrofit) {
        return retrofit.create(FlightsAPI.class);
    }



}

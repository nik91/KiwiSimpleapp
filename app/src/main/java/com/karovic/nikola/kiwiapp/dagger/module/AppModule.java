package com.karovic.nikola.kiwiapp.dagger.module;

import android.content.Context;

import com.karovic.nikola.kiwiapp.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ViewModelModule.class})
public class AppModule {

    @Provides
    @Singleton
    Context providesContext(MainApplication application){
        return application.getApplicationContext();
    }
}

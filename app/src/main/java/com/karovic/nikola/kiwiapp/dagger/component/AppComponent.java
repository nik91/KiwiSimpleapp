package com.karovic.nikola.kiwiapp.dagger.component;

import com.karovic.nikola.kiwiapp.MainApplication;
import com.karovic.nikola.kiwiapp.dagger.module.AppModule;
import com.karovic.nikola.kiwiapp.dagger.module.RoomModule;
import com.karovic.nikola.kiwiapp.dagger.module.activity.BuildActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AppModule.class,
                BuildActivityModule.class,
                RoomModule.class
        }
)
public interface AppComponent extends AndroidInjector<MainApplication> {

    interface AppComponentBuilder {
        Builder applicationModule(AppModule appModule);
    }

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication> implements AppComponentBuilder { }
}

package com.karovic.nikola.kiwiapp;

import com.karovic.nikola.kiwiapp.dagger.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MainApplication extends DaggerApplication {

    public static MainApplication instance = null;

    @Override
    protected AndroidInjector<MainApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}

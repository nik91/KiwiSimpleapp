package com.karovic.nikola.kiwiapp.dagger.module.activity;

import com.karovic.nikola.kiwiapp.ui.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildActivityModule {

    @ContributesAndroidInjector(modules = {BuildMainFragmentModule.class})
    abstract MainActivity contributeMainActivity();


}
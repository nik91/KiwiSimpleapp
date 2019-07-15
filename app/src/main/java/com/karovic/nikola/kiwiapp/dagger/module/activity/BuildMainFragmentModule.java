package com.karovic.nikola.kiwiapp.dagger.module.activity;


import com.karovic.nikola.kiwiapp.ui.fragment.FlightOfferFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildMainFragmentModule {

    @ContributesAndroidInjector()
    abstract FlightOfferFragment contributeFlightOfferFragment();

}

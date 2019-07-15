package com.karovic.nikola.kiwiapp.dagger.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.karovic.nikola.kiwiapp.ui.viewmodel.FlightOffersViewModel;
import com.karovic.nikola.kiwiapp.ui.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(includes = {NetworkModule.class, RoomModule.class})
public abstract class ViewModelModule {
    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(FlightOffersViewModel.class)
    abstract ViewModel bindsFlightOffersViewModel(FlightOffersViewModel viewModel);

}

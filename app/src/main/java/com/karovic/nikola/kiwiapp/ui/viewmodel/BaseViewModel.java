package com.karovic.nikola.kiwiapp.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BaseViewModel extends ViewModel {

    public MutableLiveData<ViewModelState> state = new MutableLiveData<>();
    public MutableLiveData<Throwable> error = new MutableLiveData<>();

    protected void onFailed(Throwable throwable) {
        throwable.printStackTrace();
        state.postValue(ViewModelState.FAILURE);
        error.postValue(throwable);
    }
}


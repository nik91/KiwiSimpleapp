package com.karovic.nikola.kiwiapp.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.karovic.nikola.kiwiapp.db.dao.DayOfferFlightDao;
import com.karovic.nikola.kiwiapp.db.model.DayOfferFlight;
import com.karovic.nikola.kiwiapp.rest.api.FlightsAPI;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.FlightData;
import com.karovic.nikola.kiwiapp.rest.response.FlightResults;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.karovic.nikola.kiwiapp.utils.StringUtils.currentDate;
import static com.karovic.nikola.kiwiapp.utils.StringUtils.getYesterdayDate;

public class FlightOffersViewModel extends BaseViewModel {

    public MutableLiveData<List<FlightData>> flightDataMutableLiveData = new MutableLiveData<>();
    private List<DayOfferFlight> dayOfferFlights;

    @Inject
    FlightsAPI flightsAPI;

    @Inject
    DayOfferFlightDao dayOfferFlightDao;


    @Inject
    FlightOffersViewModel() {
    }

    private Disposable flightOffersSubscription;


    @Override
    protected void onCleared() {
        super.onCleared();
        if (flightOffersSubscription != null) {
            flightOffersSubscription.dispose();
        }
    }


//    v:2
//    sort:popularity
//    locale:en
//    flyFrom:44.80-20.45-250km //Belgrade
//    to:anywhere
//    featureName:aggregateResults
//    dateFrom:09/07/2019
//    dateTo:21/07/2019
//    typeFlight:oneway
//    adults:1
//    limit:45

    /**
     * Save list in Room database
     * @param dayOfferFlights
     */
    public void insertFlightOffersForDay(List<DayOfferFlight> dayOfferFlights) {
        flightOffersSubscription = Completable.fromRunnable(() -> {
            dayOfferFlightDao.deleteAll(dayOfferFlights);
            dayOfferFlightDao.insertAll(dayOfferFlights);
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();

    }


    /**
     * Get list of flights offers for yesterday
     */
    public void getFlightOffersForDay() {
        flightOffersSubscription = Observable.fromCallable(() -> dayOfferFlightDao.getFlightsOffersForYesterday(getYesterdayDate()))
                .concatMap(Observable::just)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onDayOfferFlightSuccess, this::onFailed);
    }

    private void onDayOfferFlightSuccess(List<DayOfferFlight> dayOfferFlights) {
        this.dayOfferFlights = dayOfferFlights;
    }

    /**
     * Fetch data from https://api.skypicker.com
     * @param dateFrom set search for date from
     * @param dateTo set search for date to
     */
    public void getFlightsOffers(String dateFrom, String dateTo) {
        state.setValue(ViewModelState.LOADING);
        flightOffersSubscription = flightsAPI.getFlights("2", "popularity", "en", "44.80-20.45-250km", "anywhere",
                "aggregateResults", dateFrom, dateTo, "oneway", "1", "45")
                .concatMap(Observable::just)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onGetFlightsOffersSuccess, this::onFailed);

    }

    private void onGetFlightsOffersSuccess(FlightResults flightResults) {
        if (flightResults != null && flightResults.getData() != null) {

           List<FlightData> uniqueFlightOffersForTodayList = new ArrayList<>();

            Collection<FlightData> uniqueFlight = removeDuplicates(flightResults.getData());

            if (!dayOfferFlights.isEmpty()) {
                Collection<FlightData> uniqueFlightOffersForToday = removeYesterdayOffers(uniqueFlight, dayOfferFlights);
                uniqueFlightOffersForTodayList.addAll(uniqueFlightOffersForToday);
                flightDataMutableLiveData.postValue(uniqueFlightOffersForTodayList);
            } else {
                uniqueFlightOffersForTodayList.addAll(uniqueFlight);
                flightDataMutableLiveData.postValue(uniqueFlightOffersForTodayList);
            }

            List<DayOfferFlight> dayOfferFlights = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                DayOfferFlight dayOfferFlight = new DayOfferFlight();
                dayOfferFlight.setMapIdTo(uniqueFlightOffersForTodayList.get(i).getMapIdto());
                dayOfferFlight.setInsertedDate(currentDate());
                dayOfferFlights.add(dayOfferFlight);
            }

            insertFlightOffersForDay(dayOfferFlights);
        }
        state.setValue(ViewModelState.SUCCESS);
    }

    private Collection<FlightData> removeYesterdayOffers(Collection<FlightData> flightDataCollection, List<DayOfferFlight> dayOfferFlights) {
        Map<String, FlightData> map = new HashMap<String, FlightData>();
        for (FlightData flightData : flightDataCollection) {
            String key = flightData.getMapIdto();
            boolean insertFlight = true;
            for (DayOfferFlight df : dayOfferFlights) {
                if (flightData.getMapIdto().equals(df.getMapIdTo())) {
                    insertFlight = false;
                    break;
                }
            }
            if (insertFlight) {
                map.put(key, flightData);
            }

        }
        return map.values();

    }

    /**
     * This method remove duplicate from list
     * @param flightsData
     * @return list without duplicates
     */
    private Collection<FlightData> removeDuplicates(List<FlightData> flightsData) {
        Map<String, FlightData> map = new HashMap<String, FlightData>();
        for (FlightData flightData : flightsData) {
            String key = flightData.getMapIdto();
            if (!map.containsKey(key)) {
                map.put(key, flightData);
            }
        }
        return map.values();
    }
}

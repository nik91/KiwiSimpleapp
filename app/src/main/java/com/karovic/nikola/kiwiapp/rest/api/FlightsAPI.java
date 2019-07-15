package com.karovic.nikola.kiwiapp.rest.api;

import com.karovic.nikola.kiwiapp.rest.response.FlightResults;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlightsAPI {

    @GET("flights")
    Observable<FlightResults> getFlights(@Query("v") String version,
                                         @Query("sort") String sort,
                                         @Query("locale") String locale,
                                         @Query("flyFrom") String flyFrom,
                                         @Query("to") String flightTo,
                                         @Query("featureName") String featureName,
                                         @Query("dateFrom") String dateFrom,
                                         @Query("dateTo") String dateTo,
                                         @Query("typeFlight") String typeFlight,
                                         @Query("adults") String noOfAdults,
                                         @Query("limit") String limit);


}

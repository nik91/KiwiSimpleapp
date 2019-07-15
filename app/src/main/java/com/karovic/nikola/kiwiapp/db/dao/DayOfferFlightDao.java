package com.karovic.nikola.kiwiapp.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.karovic.nikola.kiwiapp.db.model.DayOfferFlight;

import java.util.List;

@Dao
public interface DayOfferFlightDao {


    @Insert
    void insertAll(List<DayOfferFlight> dayOfferFlights);

    @Delete
    void deleteAll(List<DayOfferFlight> dayOfferFlights);

    @Query("SELECT * FROM DayOfferFlight WHERE insertedDate = :yesterday")
    List<DayOfferFlight> getFlightsOffersForYesterday(String yesterday);

}

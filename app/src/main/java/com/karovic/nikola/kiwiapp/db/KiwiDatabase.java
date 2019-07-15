package com.karovic.nikola.kiwiapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.karovic.nikola.kiwiapp.db.dao.DayOfferFlightDao;
import com.karovic.nikola.kiwiapp.db.model.DayOfferFlight;

@Database(entities = {DayOfferFlight.class}, version = 1, exportSchema = false)
public abstract class KiwiDatabase extends RoomDatabase {

    public abstract DayOfferFlightDao dayOfferFlightDao();
}

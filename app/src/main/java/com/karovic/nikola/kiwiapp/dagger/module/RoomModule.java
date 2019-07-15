package com.karovic.nikola.kiwiapp.dagger.module;

import android.content.Context;

import androidx.room.Room;

import com.karovic.nikola.kiwiapp.db.dao.DayOfferFlightDao;
import com.karovic.nikola.kiwiapp.db.KiwiDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class RoomModule {

    @Provides
    @Singleton
    KiwiDatabase provideDatabase(Context context) {
        return Room.databaseBuilder(context, KiwiDatabase.class, "kiwi.db")
                .fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Reusable
    DayOfferFlightDao providesDayOfferFlightDao(KiwiDatabase db) {
        return db.dayOfferFlightDao();
    }
}

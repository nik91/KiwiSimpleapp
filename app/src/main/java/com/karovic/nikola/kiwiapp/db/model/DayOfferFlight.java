package com.karovic.nikola.kiwiapp.db.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static com.karovic.nikola.kiwiapp.utils.StringUtils.currentDate;

@Entity
public class DayOfferFlight {

    @PrimaryKey @NonNull
    private String mapIdTo;
    @NonNull
    private String insertedDate = currentDate();

    public String getMapIdTo() {
        return mapIdTo;
    }

    public void setMapIdTo(String mapIdTo) {
        this.mapIdTo = mapIdTo;
    }

    public String getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(String insertedDate) {
        this.insertedDate = insertedDate;
    }

}

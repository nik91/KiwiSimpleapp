package com.karovic.nikola.kiwiapp.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringUtils {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    /**
     * Get current date from phone
     * @return String CurrentDate
     */
    public static String currentDate() {
        Date utilDate = new Date();
        SimpleDateFormat s = new SimpleDateFormat(DATE_FORMAT);
        return s.format(utilDate);
    }

    /**
     * Get yesterday date from phone
     * @return String day of yesterday from phone
     */
    public static String getYesterdayDate() {
        SimpleDateFormat s = new SimpleDateFormat(DATE_FORMAT);
        return s.format(yesterday());
    }

    private static Date yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    private static Date nextMonth() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, +1);
        return cal.getTime();
    }

    /**
     * Get next month date from phone
     * @return String day of next month from phone
     */
    public static String getNextMonthDate() {
        SimpleDateFormat s = new SimpleDateFormat(DATE_FORMAT);
        return s.format(nextMonth());

    }

    /**
     * Get date from seconds
     * @param seconds represent Date in seconds
     * @return String date in dd/MM/yyyy format
     */
    public static String getDateFromSeconds(String seconds) {
        long secondsDate = Long.parseLong(seconds) * 1000;
        Date date = new Date(secondsDate);
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(date);
    }


}

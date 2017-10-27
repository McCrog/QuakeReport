package com.example.android.quakereport;

/**
 * Created by Alex on 26.10.2017.
 * An {@link Earthquake} object contains information related to a single earthquake.
 */

public class Earthquake {

    /** The magnitude for the event */
    private String mMagnitude;

    /**
     * Textual description of named geographic region near to the event.
     * This may be a city name, or a Flinn-Engdahl Region name.
     */
    private String mLocation;

    /**
     * Time when the event occurred.
     * Times are reported in milliseconds since the epoch ( 1970-01-01T00:00:00.000Z)
     */
    private String mDate;

    /**
     * Create a new Earthquake object.
     *
     * @param magnitude the magnitude for the event
     * @param location description of named geographic region near to the event
     * @param date time when the event occurred
     */
    public Earthquake(String magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }

    /** Get the magnitude */
    public String getMagnitude() {
        return mMagnitude;
    }

    /** Get the location */
    public String getLocation() {
        return mLocation;
    }

    /** Get the date */
    public String getDate() {
        return mDate;
    }
}

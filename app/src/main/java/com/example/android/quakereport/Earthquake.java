package com.example.android.quakereport;

/**
 * Created by Alex on 26.10.2017.
 * An {@link Earthquake} object contains information related to a single earthquake.
 */

public class Earthquake {

    /** The magnitude for the event */
    private double mMagnitude;

    /**
     * Textual description of named geographic region near to the event.
     * This may be a city name, or a Flinn-Engdahl Region name.
     */
    private String mLocation;

    /**
     * Time when the event occurred.
     * Times are reported in milliseconds since the epoch ( 1970-01-01T00:00:00.000Z)
     */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }

    /** Get the magnitude */
    public double getMagnitude() {
        return mMagnitude;
    }

    /** Get the location */
    public String getLocation() {
        return mLocation;
    }

    /** Get the date */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

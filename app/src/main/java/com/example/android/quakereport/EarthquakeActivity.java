/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    /**
     * Helpers link
     * https://earthquake.usgs.gov/earthquakes/feed/v1.0/geojson.php
     * https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.geojson
     *
     * https://github.com/udacity/ud843-QuakeReport
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        final ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.2", "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake("6.1", "London", "Aug 25, 2016"));
        earthquakes.add(new Earthquake("3.9", "Tokyo", "Dec 15, 2012"));
        earthquakes.add(new Earthquake("4.7", "Mexico City", "Sep 7, 2017"));
        earthquakes.add(new Earthquake("5.8", "Moscow", "May 2, 2015"));
        earthquakes.add(new Earthquake("2.1", "Rio de Janeiro", "June 14, 2014"));
        earthquakes.add(new Earthquake("9.9", "Paris", "Nov 3, 2013"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create an {@link EarthquakeAdapter}, whose data source is a list of {@link Earthquake}s. The
        // adapter knows how to create list items for each item in the list.
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}

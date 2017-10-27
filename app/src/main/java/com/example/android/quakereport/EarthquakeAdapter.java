package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Earthquake} objects.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param earthquake A List of Earthquake objects to display in a list
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquake) {
        super(context, 0, earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID magnitude.
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the magnitude from the currentEarthquake object and set this text on
        // the TextView.
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID magnitude.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the location from the currentEarthquake object and set this text on
        // the TextView.
        locationTextView.setText(currentEarthquake.getLocation());

        // Find the TextView in the list_item.xml layout with the ID magnitude.
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Get the location from the currentEarthquake object and set this text on
        // the TextView.
        dateTextView.setText(currentEarthquake.getDate());


        return listItemView;
    }
}

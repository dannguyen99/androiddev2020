package com.example.usthweather;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForecastFragment extends Fragment {


    public ForecastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(0xFFE0E0FF);

        /*
        //practical work 4 start here
        LinearLayout fragment_container = view.findViewById(R.id.fragment_forecast);
        fragment_container.setOrientation(LinearLayout.VERTICAL);

        // add the button in fragment
        ImageView weather = new ImageView(getContext());
        weather.setImageResource(R.drawable.sunny);

        TextView day = new TextView(getContext());
        day.setText("Thursday");
        day.setTextSize(34);
        day.setBackgroundColor(0xFF1ed7e8);
        day.setPadding(0, 10, 0, 10);

        fragment_container.addView(weather);
        fragment_container.addView(day);
        */

        return view;
    }
}

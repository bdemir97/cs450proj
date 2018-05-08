package com.example.bugra.mapzz.ui.map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bugra.mapzz.R;
import com.example.bugra.mapzz.model.InfoWindowData;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowGoogleMap implements GoogleMap.InfoWindowAdapter {

    private Context mcontext;
    private final View view;

    public CustomInfoWindowGoogleMap( Context ctx ) {
        mcontext = ctx;
        view = LayoutInflater.from( ctx )
                .inflate( R.layout.infowindow, null );
    }

    @Override
    public View getInfoWindow( Marker marker ) {

        TextView name_tv = view.findViewById( R.id.name );
        TextView details_tv = view.findViewById( R.id.details );
        LinearLayout all = view.findViewById( R.id.all );
        TextView plant_tv = view.findViewById( R.id.plant );
        TextView house_tv = view.findViewById( R.id.house );
        TextView success_tv = view.findViewById( R.id.success );
        Button button = view.findViewById( R.id.profile );
        // BackgroundColorSpan color=view.findViewById();
        // android.widget.RatingBar rating =view.findViewById(R.id.ratingBar);
        name_tv.setText( marker.getTitle() );
        details_tv.setText( marker.getSnippet() );

        InfoWindowData infoWindowData = (InfoWindowData) marker.getTag();

        plant_tv.setText( infoWindowData.getPlant() );
        house_tv.setText( infoWindowData.getHouseInfo() );
        success_tv.setText( infoWindowData.getSuccess() );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                // click handling code
            }
        } );
        //   rating.setNumStars(infoWindowData.getRating());
        return view;
    }

    @Override
    public View getInfoContents( Marker marker ) {
        return null;
    }
}
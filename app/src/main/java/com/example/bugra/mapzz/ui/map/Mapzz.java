package com.example.bugra.mapzz.ui.map;

import android.content.Intent;
import android.widget.ImageButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.bugra.mapzz.R;
import com.example.bugra.mapzz.model.InfoWindowData;
import com.example.bugra.mapzz.ui.profile.ProfileView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.view.View;

public class Mapzz extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mapzz );

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.map );
        mapFragment.getMapAsync( this );

        ImageButton btn = findViewById( R.id.home_profile_button );
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = new Intent( Mapzz.this, ProfileView.class );
                startActivity( i );
            }
        } );
    }


    @Override
    public void onMapReady( GoogleMap googleMap ) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled( true );
        mMap.setMinZoomPreference( 11 );

        LatLng bdemir97 = new LatLng( 40.000009, 29.000009 );

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position( bdemir97 )
                .title( "bdemir97" )
                .icon( BitmapDescriptorFactory.fromResource( R.drawable.yesilmark ) );

        InfoWindowData info = new InfoWindowData();
        info.setPlant( "Plant: Persley" );
        info.setHouseInfo( "House Information: Balcony" );
        info.setSuccess( "Success: ***" );
        info.setRating( 1 );
        CustomInfoWindowGoogleMap customInfoWindow = new CustomInfoWindowGoogleMap( this );
        mMap.setInfoWindowAdapter( customInfoWindow );

        Marker m = mMap.addMarker( markerOptions );
        m.setTag( info );

        mMap.moveCamera( CameraUpdateFactory.newLatLng( bdemir97 ) );
    }
}



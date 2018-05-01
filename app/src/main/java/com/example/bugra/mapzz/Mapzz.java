package com.example.bugra.mapzz;
import android.content.Intent;
import android.telecom.Call;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*public class Mapzz extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapzz);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getMaxZoomLevel();
        mMap.getMinZoomLevel();
        mMap.setMinZoomPreference(15);
        mMap.setMaxZoomPreference(18);
        String username="bdemir97";
        String Plant="Strawberry";
        int Success=15;
        String SnippetText = "Username: " + username + "\n" +
                            "Plant Type: " + Plant + "\n" +
                            "Success: %" + Success +"\n";
        String MarkerTitle = "Marker of " + username;



        // Add a marker in Istanbul and move the camera
        LatLng ist2 =new LatLng(40.998000,29.074000);
        mMap.addMarker(new MarkerOptions().position(ist2).title(MarkerTitle).icon(BitmapDescriptorFactory.fromResource(R.drawable.rose2)).snippet(SnippetText ));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(ist2));

    }
    }*/

public class Mapzz extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.infowindow);
       // android.widget.LinearLayout mealLayout = (android.widget.LinearLayout) findViewById(R.id.all);
       // mealLayout.setBackgroundColor(android.graphics.Color.RED);
        setContentView(R.layout.activity_mapzz);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        View.OnClickListener listnr=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Mapzz.this, layout.class);
                startActivity(i);
            }
        };
        ImageButton btn =(ImageButton) findViewById(R.id.imageButton6);
        btn.setOnClickListener(listnr);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMinZoomPreference(11);

        LatLng bdemir97 = new LatLng(40.000009, 29.000009);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(bdemir97)
                .title("bdemir97")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.yesilmark));

        InfoWindowData info = new InfoWindowData();
        info.setPlant("Plant: Persley");
        info.setHouseInfo("House Information: Balcony");
        info.setSuccess("Success: ***");
        info.setRating(1);
        CustomInfoWindowGoogleMap customInfoWindow = new CustomInfoWindowGoogleMap(this);
        mMap.setInfoWindowAdapter(customInfoWindow);

        Marker m = mMap.addMarker(markerOptions);
        m.setTag(info);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(bdemir97));

    }
}



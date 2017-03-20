package com.es.smit.gtu_techfest5;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends Fragment implements OnMapReadyCallback
{
    GoogleMap gm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_maps, container,false);
        getActivity().setTitle("Maps");
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment = (MapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        gm=googleMap;

        double latitude = 21.1333526 ;
        double longitude = 72.7185106 ;


        googleMap.getUiSettings().setZoomGesturesEnabled(true);

        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setMapToolbarEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setTiltGesturesEnabled(true);

        googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        // create marker
        MarkerOptions ckp,d1,d2,d3,d4,d5,d6,d7,phar,admin,food1,food2;


        ckp = new MarkerOptions().position(new LatLng(21.132894, 72.717705))
                .title(" C. K. Pithawalla College of Engineering & Technology ");
        ckp.icon(BitmapDescriptorFactory.fromResource(R.drawable.ckpcet_map));
        googleMap.addMarker(ckp);

        admin = new MarkerOptions().position(new LatLng(21.132061, 72.718034))
                .title("Admin Department");
        admin.icon(BitmapDescriptorFactory.fromResource(R.drawable.admin));
        googleMap.addMarker(admin);


        d1 = new MarkerOptions().position(new LatLng(21.132399, 72.718648))
                .title("Computer Department");
        d1.icon(BitmapDescriptorFactory.fromResource(R.drawable.d1));
        googleMap.addMarker(d1);

        d2 = new MarkerOptions().position(new LatLng(21.132808, 72.718514))
                .title("Ec Department");
        d2.icon(BitmapDescriptorFactory.fromResource(R.drawable.d2));
        googleMap.addMarker(d2);

        d3 = new MarkerOptions().position(new LatLng(21.133186, 72.718351))
                .title("Electrical Department");
        d3.icon(BitmapDescriptorFactory.fromResource(R.drawable.d3));
        googleMap.addMarker(d3);

        d4 = new MarkerOptions().position(new LatLng(21.133590, 72.718061))
                .title("Management Department");
        d4.icon(BitmapDescriptorFactory.fromResource(R.drawable.d4));
        googleMap.addMarker(d4);

        d5 = new MarkerOptions().position(new LatLng(21.133824, 72.717845))
                .title("");
        d5.icon(BitmapDescriptorFactory.fromResource(R.drawable.d5));
        googleMap.addMarker(d5);

        d6 = new MarkerOptions().position(new LatLng(21.134110, 72.717439))
                .title("Civil Department");
        d6.icon(BitmapDescriptorFactory.fromResource(R.drawable.d6));
        googleMap.addMarker(d6);

        d7 = new MarkerOptions().position(new LatLng(21.134292, 72.717075))
                .title("Mechanical Department");
        d7.icon(BitmapDescriptorFactory.fromResource(R.drawable.d7));
        googleMap.addMarker(d7);

        phar = new MarkerOptions().position(new LatLng(21.134481, 72.716583))
                .title("Pharmacy Department");
        phar.icon(BitmapDescriptorFactory.fromResource(R.drawable.pharma_map));
        googleMap.addMarker(phar);

        food1 = new MarkerOptions().position(new LatLng(21.133352, 72.718649))
                .title("Food");
        food1.icon(BitmapDescriptorFactory.fromResource(R.drawable.food));
        googleMap.addMarker(food1);

        food2 = new MarkerOptions().position(new LatLng(21.134626, 72.717166))
                .title("Food");
        food2.icon(BitmapDescriptorFactory.fromResource(R.drawable.food));
        googleMap.addMarker(food2);




        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                new LatLng(21.132634, 72.717813)).zoom(17).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));


    }

}

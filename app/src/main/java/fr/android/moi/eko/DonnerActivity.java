package fr.android.moi.eko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Scanner;

public class DonnerActivity extends Activity implements OnMapReadyCallback { //peut etre extends AppCompatActivity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate activity", "ok");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donner2);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        Log.i("onMapReady activity", "ok");
        //MapsInitializer.initialize(getContext());
        //mGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(48.8520511,2.2773901)).title("ECE Paris"));
    }

}

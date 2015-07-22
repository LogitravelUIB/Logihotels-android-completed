package com.logitravel.logihotels.done;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.logitravel.logihotels.R;
import com.logitravel.logihotels.done.internal.BaseActivity;
import com.logitravel.logihotels.done.internal.injection.Injector;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.presenter.MapPresenter;
import com.logitravel.logihotels.done.view.IHotelMapView;

public class MapActivity extends BaseActivity implements OnMapReadyCallback, IHotelMapView {
    public static final String EXTRAS_ARGUMENTS_OBJECT = "arguments";
    private static final String TAG = "MapActivity";
    private Arguments arguments;
    private MapPresenter presenter;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    @Override protected void onResume() {
        super.onResume();
        Injector.getInstance().getScreenDirector().onResume(this);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override protected void onLoad(@Nullable Bundle extras) {

        if (extras == null) {
            throw new RuntimeException("MapActivity must contain extras");
        }
        arguments = Arguments.fromExtras(extras);

        Log.d(TAG, "onLoad: args=" + arguments);

        presenter = new MapPresenter(this);
    }

    @Override public void onMapReady(GoogleMap googleMap) {
        Log.d(TAG, "onMapReady");

        this.googleMap = googleMap;
        googleMap.setMyLocationEnabled(true);
        presenter.load(arguments);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_switch:
                presenter.onShowListClicked();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override public void drawHotel(Hotel hotel, boolean selected) {
        LatLng position = new LatLng(hotel.getLatitude(), hotel.getLongitude());
        googleMap.addMarker(new MarkerOptions()
                .title(hotel.getName())
                .icon(BitmapDescriptorFactory.defaultMarker(selected ? BitmapDescriptorFactory.HUE_ORANGE : BitmapDescriptorFactory.HUE_BLUE))
                .position(position));
    }

    @Override public void moveCameraTo(double lat, double lng) {
        LatLng position = new LatLng(lat, lng);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 14f));
//          googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), 14f));
    }

    @Override public void clearHotels() {
        googleMap.clear();
    }

    public static class Arguments {
        public Hotel[] hotels;
        public String selectedHotelCode;

        public Arguments(Hotel[] hotels, String selectedHotelCode) {
            this.hotels = hotels;
            this.selectedHotelCode = selectedHotelCode;
        }

        public Arguments() {
        }

        public static Arguments fromExtras(Bundle extras) {
            return new Gson().fromJson(extras.getString(EXTRAS_ARGUMENTS_OBJECT), Arguments.class);
        }

        public boolean hasSelectedHotel() {
            return !TextUtils.isEmpty(selectedHotelCode);
        }


        public Hotel getSelectedHotel() {
            if (!hasSelectedHotel()) {
                throw new RuntimeException("Arguments didn't set a selected hotel.");
            }

            for (Hotel hotel : hotels) {
                if (TextUtils.equals(hotel.getCode(), selectedHotelCode))
                    return hotel;
            }

            throw new RuntimeException("No hotel found with code " + selectedHotelCode);
        }

        public Hotel[] getHotels() {
            return hotels;
        }

        public boolean isSelected(Hotel hotel) {
            return TextUtils.equals(hotel.getCode(), selectedHotelCode);
        }

        @Override public String toString() {
            return String.format("Hotels count %s. Selected hotel code is %s", hotels.length, hasSelectedHotel() ? getSelectedHotel().getCode() : "none");
        }
    }
}

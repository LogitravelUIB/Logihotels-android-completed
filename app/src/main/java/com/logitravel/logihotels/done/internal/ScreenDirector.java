package com.logitravel.logihotels.done.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.logitravel.logihotels.done.HotelListActivity;
import com.logitravel.logihotels.done.MapActivity;
import com.logitravel.logihotels.done.model.Hotel;

import java.lang.ref.WeakReference;

/**
 * Manages transitions between screens. This project treats activities as screens
 */
public class ScreenDirector {
    private static final String TAG = ScreenDirector.class.getSimpleName();

    private WeakReference<Activity> activity;
    private Gson gson;

    public ScreenDirector(Gson gson) {
        this.gson = gson;
    }

    public void showHotelList() {
        startActivity(HotelListActivity.class);
    }

    public void showMap(Hotel[] hotels, @Nullable String selectedHotelCode) {
        Bundle bundle = new Bundle();
        MapActivity.Arguments args = new MapActivity.Arguments(hotels, selectedHotelCode);
        bundle.putString(MapActivity.EXTRAS_ARGUMENTS_OBJECT, gson.toJson(args));

        startActivity(MapActivity.class, bundle);
    }

    public void onResume(Activity activity) {
        this.activity = new WeakReference<>(activity);
    }

    private void startActivity(Class<? extends Activity> activityClass, Bundle bundle) {
        Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "No activity registered to start another one");
            return;
        }

        Intent intent = new Intent(activity, activityClass);
        if (bundle != null) {
            intent.putExtras(bundle);
        }

        activity.startActivity(intent);
    }

    private void startActivity(Class<? extends Activity> activityClass) {
        startActivity(activityClass, null);
    }
}

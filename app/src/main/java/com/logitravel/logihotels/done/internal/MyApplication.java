package com.logitravel.logihotels.done.internal;

import android.app.Application;

import com.squareup.picasso.Picasso;

public class MyApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();

        Picasso.setSingletonInstance(new Picasso.Builder(this)
                .loggingEnabled(true)
                .build());
    }
}

package com.logitravel.logihotels.done.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.logitravel.logihotels.done.internal.injection.Injector;

public abstract class BaseActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onLoad(getIntent().getExtras());
    }

    @Override protected void onResume() {
        super.onResume();

        Injector.getInstance().getScreenDirector().onResume(this);
    }

    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        onLoad(getIntent().getExtras());
    }

    protected abstract void onLoad(@Nullable Bundle extras);
}

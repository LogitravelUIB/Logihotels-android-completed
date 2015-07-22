package com.logitravel.logihotels.done.internal.injection;

import com.google.gson.Gson;

public class DataModule {
    private Gson gson;

    public String provideEndpointUrl() {
        return "http://localhost:????/";
    }

    public boolean isMock() {
        return true;
    }

    public Gson provideGson() {
        if (gson == null) {
            gson = new Gson();
        }

        return gson;
    }
}

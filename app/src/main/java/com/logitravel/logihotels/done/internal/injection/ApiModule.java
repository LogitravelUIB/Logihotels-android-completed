package com.logitravel.logihotels.done.internal.injection;

import com.logitravel.logihotels.done.api.HotelApi;
import com.logitravel.logihotels.done.api.MockHotelApi;

import retrofit.RestAdapter;

public class ApiModule {
    public RestAdapter provideRestAdapter(String endpoint) {
        return new RestAdapter.Builder()
                .setEndpoint(endpoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

    public HotelApi provideHotelApi(RestAdapter restAdapter, boolean isMock) {
        if (isMock) {
            return new MockHotelApi();
        } else {
            return restAdapter.create(HotelApi.class);
        }
    }
}

package com.logitravel.logihotels.done.internal.injection;

import com.logitravel.logihotels.done.internal.ScreenDirector;
import com.logitravel.logihotels.done.api.HotelApi;

/**
 * Singleton for manual DI
 */
public class Injector {
    private static Injector instance;

    private final DataModule dataModule;
    private final ApiModule apiModule;
    private HotelApi hotelApi;
    private ScreenDirector screenDirector;

    public Injector() {
        apiModule = new ApiModule();
        dataModule = new DataModule();
    }

    public static Injector getInstance() {
        if (instance == null) {
            instance = new Injector();
        }

        return instance;
    }

    public HotelApi getHotelApi() {
        if (hotelApi == null) {
            hotelApi = apiModule.provideHotelApi(
                    apiModule.provideRestAdapter(dataModule.provideEndpointUrl()),
                    dataModule.isMock());
        }

        return hotelApi;
    }

    public ScreenDirector getScreenDirector() {
        if (screenDirector == null) {
            screenDirector = new ScreenDirector(dataModule.provideGson());
        }

        return screenDirector;
    }
}

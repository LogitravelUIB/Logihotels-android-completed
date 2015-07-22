package com.logitravel.logihotels.done.presenter;

import com.logitravel.logihotels.done.api.HotelApi;
import com.logitravel.logihotels.done.internal.ScreenDirector;
import com.logitravel.logihotels.done.internal.injection.Injector;
import com.logitravel.logihotels.done.internal.task.Task;
import com.logitravel.logihotels.done.internal.task.TaskCallback;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.view.IHotelListView;

import java.util.List;

public class ListPresenter {
    private final ScreenDirector screenDirector;
    private final HotelApi hotelApi;
    private IHotelListView view;

    private Hotel[] hotels;

    public ListPresenter(final IHotelListView view) {
        this.view = view;
        screenDirector = Injector.getInstance().getScreenDirector();
        hotelApi = Injector.getInstance().getHotelApi();

        Task.doInBackground(new TaskCallback<List<Hotel>>() {
            @Override public List<Hotel> executeInBackground() {
                return hotelApi.getHotels("6600", "es");
            }

            @Override public void onCompleted(List<Hotel> hotels) {
                onHotelsReceived(hotels);
            }

            @Override public void onError(Throwable t) {
                view.showError("Error getting hotels");
            }
        });
    }

    private void onHotelsReceived(List<Hotel> hotels) {
        this.hotels = hotels.toArray(new Hotel[hotels.size()]);
        view.showHotels(hotels);
    }

    public void onHotelClicked(Hotel hotel) {
        screenDirector.showMap(hotels, hotel.getCode());
    }

    public void onShowMapClicked() {
        screenDirector.showMap(hotels, null);
    }
}

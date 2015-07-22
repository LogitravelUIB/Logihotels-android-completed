package com.logitravel.logihotels.done.presenter;

import com.logitravel.logihotels.done.MapActivity;
import com.logitravel.logihotels.done.internal.ScreenDirector;
import com.logitravel.logihotels.done.internal.injection.Injector;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.view.IHotelMapView;

public class MapPresenter {
    private final ScreenDirector screenDirector;
    private IHotelMapView view;

    public MapPresenter(IHotelMapView view) {
        this.view = view;
        screenDirector = Injector.getInstance().getScreenDirector();
    }

    public void load(MapActivity.Arguments arguments) {
        view.clearHotels();

        for (Hotel hotel : arguments.getHotels()) {
            view.drawHotel(hotel, arguments.isSelected(hotel));
        }

        if (arguments.hasSelectedHotel()) {
            Hotel selectedHotel = arguments.getSelectedHotel();
            view.moveCameraTo(selectedHotel.getLatitude(), selectedHotel.getLongitude());
        }
    }

    public void onHotelSelected(Hotel hotel) {

    }

    public void onShowListClicked() {
        screenDirector.showHotelList();
    }
}

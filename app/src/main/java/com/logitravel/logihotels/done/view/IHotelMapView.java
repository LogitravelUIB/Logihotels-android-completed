package com.logitravel.logihotels.done.view;

import com.logitravel.logihotels.done.model.Hotel;

public interface IHotelMapView {
    void drawHotel(Hotel hotel, boolean selected);

    void moveCameraTo(double lat, double lng);

    void clearHotels();
}

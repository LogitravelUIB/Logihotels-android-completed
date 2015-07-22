package com.logitravel.logihotels.done.view;

import com.logitravel.logihotels.done.model.Hotel;

import java.util.List;

public interface IHotelListView {
    void showHotels(List<Hotel> hotels);

    void showError(String message);
}

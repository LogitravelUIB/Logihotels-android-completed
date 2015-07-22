package com.logitravel.logihotels.done.internal;

import com.logitravel.logihotels.done.internal.model.LogiHotel;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.model.Price;

public class HotelBinder {

    public Hotel bind(LogiHotel logiHotel) {
        return new Hotel.Builder()
                .setName(logiHotel.name.trim())
                .setCategory(logiHotel.category.trim())
                .setLatitude(logiHotel.geoPosition.latitude + "")
                .setLongitude(logiHotel.geoPosition.longitude + "")
                .setCode(logiHotel.code)
                .setImageUrl(logiHotel.imageUrl)
                .setPrice(new Price.Builder()
                        .setPvp(logiHotel.price.value)
                        .build())
                .build();
    }
}

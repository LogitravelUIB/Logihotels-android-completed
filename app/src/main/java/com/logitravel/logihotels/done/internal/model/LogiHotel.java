package com.logitravel.logihotels.done.internal.model;

import com.google.gson.annotations.SerializedName;

public class LogiHotel {
    @SerializedName("Code") public String code;
    @SerializedName("Name") public String name;
    @SerializedName("Category") public String category;
    @SerializedName("GeoPosition") public GeoPosition geoPosition;
    @SerializedName("ImageUrl") public String imageUrl;
    @SerializedName("Price") public Price price;

    public static class GeoPosition {
        @SerializedName("Latitude") public double latitude;
        @SerializedName("Longitude") public double longitude;
    }

    public static class Price {
        @SerializedName("Value") public float value;
    }

}

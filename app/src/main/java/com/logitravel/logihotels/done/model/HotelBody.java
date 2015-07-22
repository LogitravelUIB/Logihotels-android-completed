package com.logitravel.logihotels.done.model;

import com.google.gson.annotations.SerializedName;

public class HotelBody {
    @SerializedName("cityCode")
    String cityCode;

    @SerializedName("language")
    String language;

    @SerializedName("count")
    int resultsCount;

    public HotelBody(String cityCode, String language, int resultsCount) {
        this.cityCode = cityCode;
        this.language = language;
        this.resultsCount = resultsCount;
    }
}

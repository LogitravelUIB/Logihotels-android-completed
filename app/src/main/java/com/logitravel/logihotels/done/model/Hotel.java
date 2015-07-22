package com.logitravel.logihotels.done.model;

import com.google.gson.annotations.SerializedName;

public class Hotel {
    @SerializedName("Code")
    String code;

    @SerializedName("Name")
    String name;

    @SerializedName("Category")
    String category;

    @SerializedName("Image")
    String imageUrl;

    @SerializedName("Description")
    String description;

    @SerializedName("Latitude")
    String latitude;

    @SerializedName("Longitude")
    String longitude;

    @SerializedName("Price")
    Price price;

    public Hotel() {
    }

    public Hotel(String code, String name, String category, String imageUrl, String description, String latitude, String longitude, Price price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.imageUrl = imageUrl;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCategory() {
        return category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getLatitude() {
        return Double.parseDouble(latitude);
    }

    public double getLongitude() {
        return Double.parseDouble(longitude);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        String code;
        String name;
        String category;
        String imageUrl;
        String description;
        String latitude;
        String longitude;
        Price price;

        public Builder setPrice(Price price) {
            this.price = price;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }


        public Hotel build() {
            return new Hotel(code, name, category, imageUrl, description, latitude, longitude, price);
        }
    }
}

package com.logitravel.logihotels.done.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Price {
    @SerializedName("CheckIn")
    Date checkInDate;

    @SerializedName("Nights")
    int nights;

    @SerializedName("Pvp")
    float pvp;

    @SerializedName("Board")
    String board;

    public Price() {
    }

    public Price(Date checkInDate, int nights, float pvp, String board) {
        this.checkInDate = checkInDate;
        this.nights = nights;
        this.pvp = pvp;
        this.board = board;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public int getNights() {
        return nights;
    }

    public float getPvp() {
        return pvp;
    }

    public String getBoard() {
        return board;
    }

    public static class Builder {
        Date checkInDate;
        int nights;
        float pvp;
        String board;

        public Builder() {
        }


        public Builder setCheckInDate(Date checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        public Builder setNights(int nights) {
            this.nights = nights;
            return this;
        }

        public Builder setPvp(float pvp) {
            this.pvp = pvp;
            return this;
        }

        public Builder setBoard(String board) {
            this.board = board;
            return this;
        }

        public Price build() {
            return new Price(checkInDate, nights, pvp, board);
        }
    }
}

package com.logitravel.logihotels.done.api;

import com.logitravel.logihotels.done.model.Hotel;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * This is used by Retrofit to make the http call and convert the response to plain java objects<br>
 *
 * @see <a href="http://square.github.io/retrofit/">Retrofit</a>
 */
public interface HotelApi {
    @GET("api/hotel/{city}") List<Hotel> getHotels(@Path("city") String city, @Path("lang") String language);
}

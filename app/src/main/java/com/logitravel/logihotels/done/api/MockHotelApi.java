package com.logitravel.logihotels.done.api;

import com.google.gson.Gson;
import com.logitravel.logihotels.done.internal.HotelBinder;
import com.logitravel.logihotels.done.internal.injection.ApiModule;
import com.logitravel.logihotels.done.internal.injection.DataModule;
import com.logitravel.logihotels.done.internal.model.LogiHotel;
import com.logitravel.logihotels.done.model.Hotel;

import java.util.Arrays;
import java.util.List;

/**
 * Mocked API response in case you can't run the Visual Studio project which deploys the HTTP API. <br>
 * Check {@link ApiModule} and {@link DataModule} to change to non-mocked response and configure the url parameters.
 */
public class MockHotelApi implements HotelApi {
    @Override public List<Hotel> getHotels(String cityCode, String language) {
        LogiHotel[] logiHotels = new Gson().fromJson(getJson(), LogiHotel[].class);
        Hotel[] hotels = new Hotel[logiHotels.length];

        //This binder converts LogiHotel objects to Hotel objects
        //I couldn't access the API in time, so I had to take a part of a real call used in Logitravel
        HotelBinder hotelBinder = new HotelBinder();

        for (int i = 0; i < hotels.length; i++) {
            hotels[i] = hotelBinder.bind(logiHotels[i]);
        }

        return Arrays.asList(hotels);
    }

    private String getJson() {
        return "[{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/146/025/0/original.jpg?f=1507122005\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 386.02274151880465,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 1,\n" +
                "  \"Code\": \"146025\",\n" +
                "  \"Name\": \"Agora Juan De Austria\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43206,\n" +
                "\t\"Longitude\": -3.699297\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/549/0/original.jpg?f=1507051034\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 673.312383612663,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 2,\n" +
                "  \"Code\": \"1549\",\n" +
                "  \"Name\": \"Tryp Madrid Gran Vía Hotel\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41987352,\n" +
                "\t\"Longitude\": -3.70236307\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/290/0/original.jpg?f=1507132024\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 884.2295158286778,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 3,\n" +
                "  \"Code\": \"1290\",\n" +
                "  \"Name\": \"Senator Gran Vía 21 Hotel\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42005,\n" +
                "\t\"Longitude\": -3.70107\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/foto-3.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 473.6505681818182,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 4,\n" +
                "  \"Code\": \"1868949\",\n" +
                "  \"Name\": \"NeoMagna Madrid\",\n" +
                "  \"Category\": \"**\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4283894,\n" +
                "\t\"Longitude\": -3.6711833\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/3/034/0/original.jpg?f=1507130817\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 922.4355899444588,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 5,\n" +
                "  \"Code\": \"3034\",\n" +
                "  \"Name\": \"Vincci Capitol\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42025946,\n" +
                "\t\"Longitude\": -3.70650172\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/111/442/0/original.jpg?f=1507191017\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 507.4,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 6,\n" +
                "  \"Code\": \"111442\",\n" +
                "  \"Name\": \"Zenit Abeba\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43188146,\n" +
                "\t\"Longitude\": -3.67360711\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/38meliagalgos-solariumterrace.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 766.596834264432,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 7,\n" +
                "  \"Code\": \"3852\",\n" +
                "  \"Name\": \"Melia Galgos\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.435385,\n" +
                "\t\"Longitude\": -3.685632\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 0,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/659/267/0/original.jpg?f=1506292216\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 989.6880819366853,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 8,\n" +
                "  \"Code\": \"659267\",\n" +
                "  \"Name\": \"Innside Madrid Suecia\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41762,\n" +
                "\t\"Longitude\": -3.69562\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1811/375/0/original.jpg?f=1506261605\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 435.90909090909093,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 9,\n" +
                "  \"Code\": \"1811375\",\n" +
                "  \"Name\": \"Hostal Buelta Madrid\",\n" +
                "  \"Category\": \"**\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40905,\n" +
                "\t\"Longitude\": -3.69298\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/03atrypwashington-tryproomgranviaview.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 679.5158286778399,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 10,\n" +
                "  \"Code\": \"1556\",\n" +
                "  \"Name\": \"Tryp Madrid Centro\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42285886,\n" +
                "\t\"Longitude\": -3.70971501\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/breakfast-buffet.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 731.4362197392924,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 11,\n" +
                "  \"Code\": \"1554\",\n" +
                "  \"Name\": \"Tryp Plaza de España\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42297729,\n" +
                "\t\"Longitude\": -3.70990008\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/2/655/0/original.jpg?f=1507190818\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 749.2067039106146,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 12,\n" +
                "  \"Code\": \"2655\",\n" +
                "  \"Name\": \"Vincci Soho\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4148786,\n" +
                "\t\"Longitude\": -3.69842827\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/434/0/original.jpg?f=1507111619\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 2738.8843705303307,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 13,\n" +
                "  \"Code\": \"1434\",\n" +
                "  \"Name\": \"Regente\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41969995,\n" +
                "\t\"Longitude\": -3.70428354\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201504/rincon-lobby-2.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 799.9,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 14,\n" +
                "  \"Code\": \"510\",\n" +
                "  \"Name\": \"H10 Villa De La Reina\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.420035,\n" +
                "\t\"Longitude\": -3.700315\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/499/0/original.jpg?f=1507102215\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 397.6136363636364,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"499\",\n" +
                "  \"Name\": \"Chamartín\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.47218763,\n" +
                "\t\"Longitude\": -3.68354201\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/609/0/original.jpg?f=1507110016\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 414.6020961316435,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"609\",\n" +
                "  \"Name\": \"Osuna\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4529152,\n" +
                "\t\"Longitude\": -3.61339688\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/5/720/0/original.jpg?f=1507110616\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 680.7445255018195,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"5720\",\n" +
                "  \"Name\": \"Senator Gran Via 70\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42271797,\n" +
                "\t\"Longitude\": -3.70949507\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/confortel_alcala_lobby_qRa5MlV.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 371.1362603143695,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1720\",\n" +
                "  \"Name\": \"Confortel Alcala Norte\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43692412,\n" +
                "\t\"Longitude\": -3.62126112\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/078/0/original.jpg?f=1507110017\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 513.6363636363636,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1078\",\n" +
                "  \"Name\": \"Celuisma Florida Norte\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42104358,\n" +
                "\t\"Longitude\": -3.72114524\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 9,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/2/863/0/original.jpg?f=1507101915\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 761.5642458100559,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"2863\",\n" +
                "  \"Name\": \"Paseo Del Arte\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40989352,\n" +
                "\t\"Longitude\": -3.69365528\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/74/020/0/original.jpg?f=1507140221\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 576.4995313964387,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"74020\",\n" +
                "  \"Name\": \"Príncipe Pío\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42087614,\n" +
                "\t\"Longitude\": -3.71482193\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1786/050/0/original.jpg?f=1506260458\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 672.0111731843575,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1786050\",\n" +
                "  \"Name\": \"Best Western Mayorazgo\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42213194,\n" +
                "\t\"Longitude\": -3.70960504\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/127/984/0/original.jpg?f=1507160035\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 582.8460484239379,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"127984\",\n" +
                "  \"Name\": \"Ganivet\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40824,\n" +
                "\t\"Longitude\": -3.71085\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/976/0/original.jpg?f=1507111219\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 807.5977653631285,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"976\",\n" +
                "  \"Name\": \"Princesa\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42921401,\n" +
                "\t\"Longitude\": -3.71498957\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/42/555/0/original.jpg?f=1507131702\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 400,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"42555\",\n" +
                "  \"Name\": \"Amaral\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.45862567,\n" +
                "\t\"Longitude\": -3.69526863\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/suite-ejecutiva.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 669.7954545454545,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"72279\",\n" +
                "  \"Name\": \"Gran Hotel Velazquez\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42818396,\n" +
                "\t\"Longitude\": -3.68370026\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/hotel-piscina-madrid-ilunion-atrium7564.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 575.6806645131518,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"159744\",\n" +
                "  \"Name\": \"Ilunion Atrium\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.447711,\n" +
                "\t\"Longitude\": -3.65487\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/2/280/0/original.jpg?f=1506110313\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 596.9431818181819,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"2280\",\n" +
                "  \"Name\": \"Maria Elena Palace\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41829,\n" +
                "\t\"Longitude\": -3.70141\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/288/970/0/original.jpg?f=1506211922\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 460.22727272727275,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"288970\",\n" +
                "  \"Name\": \"Aptos. Compostela Suites\",\n" +
                "  \"Category\": \"II\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.447656,\n" +
                "\t\"Longitude\": -3.580305\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1820/842/0/original.jpg?f=1506271005\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 344.4495203289173,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1820842\",\n" +
                "  \"Name\": \"Travelodge Madrid Alcalá\",\n" +
                "  \"Category\": \"*\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43702,\n" +
                "\t\"Longitude\": -3.63113\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/2/214/0/original.jpg?f=1507120618\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 381.9886363636364,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"2214\",\n" +
                "  \"Name\": \"Travelodge Torrelaguna\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.44439145,\n" +
                "\t\"Longitude\": -3.65484238\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/305/0/original.jpg?f=1507121021\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 489.09090909090907,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1305\",\n" +
                "  \"Name\": \"Holiday Inn Madrid - Calle Alcala\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43933711,\n" +
                "\t\"Longitude\": -3.6322099\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/128/299/0/original.jpg?f=1506150944\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 534.8409090909091,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"128299\",\n" +
                "  \"Name\": \"Victoria 4\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4162019,\n" +
                "\t\"Longitude\": -3.70162815\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/01-vista-exterior-external-view.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 460.22727272727275,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"518\",\n" +
                "  \"Name\": \"Puerta De Toledo\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40629488,\n" +
                "\t\"Longitude\": -3.71226311\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/5/269/0/original.jpg?f=1507180817\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 580.2192782092279,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"5269\",\n" +
                "  \"Name\": \"Avenida Gran Via\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41970812,\n" +
                "\t\"Longitude\": -3.70413601\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/confortel_pioxii_lobby-11.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 395.8863636363636,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1054\",\n" +
                "  \"Name\": \"Ilunion Pio XII\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.46891473,\n" +
                "\t\"Longitude\": -3.67366612\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/suite_7.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 582.0489155514537,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"517\",\n" +
                "  \"Name\": \"Praga\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.393893,\n" +
                "\t\"Longitude\": -3.707648\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/478/0/original.jpg?f=1507110016\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 391.02272727272725,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"478\",\n" +
                "  \"Name\": \"Hotel Mirador de Chamartín\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.48313,\n" +
                "\t\"Longitude\": -3.67094\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/345/377/0/original.jpg?f=1506212234\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 503.875,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"345377\",\n" +
                "  \"Name\": \"Aparthotel Eurobuilding 2\",\n" +
                "  \"Category\": \"IIII\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.45830322,\n" +
                "\t\"Longitude\": -3.69459271\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/481/0/original.jpg?f=1507111617\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 535.2329830973047,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"481\",\n" +
                "  \"Name\": \"Gran Hotel Conde Duque\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4308341,\n" +
                "\t\"Longitude\": -3.70772213\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/hall-hotel-accesible-confortel-suites-madrid-10.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 486.68252221551717,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"935\",\n" +
                "  \"Name\": \"Confortel Suites Madrid\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.44777986,\n" +
                "\t\"Longitude\": -3.66914123\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/alb_011.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 351.70466562030623,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1347\",\n" +
                "  \"Name\": \"Aparthotel Sercotel Togumar\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4438893,\n" +
                "\t\"Longitude\": -3.67256373\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201503/10.JPG?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 398.40909090909093,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"3983\",\n" +
                "  \"Name\": \"Mercader\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.36062676,\n" +
                "\t\"Longitude\": -3.66519436\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/906/715/0/original.jpg?f=1506241537\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 648.9090909090909,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"906715\",\n" +
                "  \"Name\": \"Nh Ribera Del Manzanares\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40643785,\n" +
                "\t\"Longitude\": -3.72164011\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/95/447/0/original.jpg?f=1507141920\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 422.5,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"95447\",\n" +
                "  \"Name\": \"Hotel Vía Castellana\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.46730066,\n" +
                "\t\"Longitude\": -3.68844777\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/490/0/original.jpg?f=1507131242\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 484.1818181818182,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1490\",\n" +
                "  \"Name\": \"Gran Versalles\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42832484,\n" +
                "\t\"Longitude\": -3.6970979\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/498/0/original.jpg?f=1507162217\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 634.5454545454545,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"498\",\n" +
                "  \"Name\": \"Ac Carlton Madrid\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.40516338,\n" +
                "\t\"Longitude\": -3.69359493\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/475/0/original.jpg?f=1507120217\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1026.4356407566004,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"475\",\n" +
                "  \"Name\": \"Aptos. Espahotel Gran Via 65\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42267611,\n" +
                "\t\"Longitude\": -3.70997116\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/240/0/original.jpg?f=1507112217\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 308.57954545454544,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1240\",\n" +
                "  \"Name\": \"Infanta Mercedes\",\n" +
                "  \"Category\": \"**\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.45802363,\n" +
                "\t\"Longitude\": -3.69861871\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/111/439/0/original.jpg?f=1506150349\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 447.2,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"111439\",\n" +
                "  \"Name\": \"Zenit Conde Orgaz\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.45681442,\n" +
                "\t\"Longitude\": -3.64761301\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/6/122/0/original.jpg?f=1506102147\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 569.5066240292371,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"6122\",\n" +
                "  \"Name\": \"Rafael Ventas\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.431994,\n" +
                "\t\"Longitude\": -3.656479\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201504/villareal-entrance.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1197.9441340782123,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"528\",\n" +
                "  \"Name\": \"Villa Real\",\n" +
                "  \"Category\": \"*****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41553821,\n" +
                "\t\"Longitude\": -3.69702548\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/546/0/original.jpg?f=1506110109\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 537.5020695566448,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1546\",\n" +
                "  \"Name\": \"Tryp Madrid Chamartín\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.472979,\n" +
                "\t\"Longitude\": -3.686878\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/5/350/0/original.jpg?f=1506102031\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 484.22727272727275,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"5350\",\n" +
                "  \"Name\": \"Petit Palace Tres Cruces\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41936506,\n" +
                "\t\"Longitude\": -3.7028271\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 9,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1071/528/0/original.jpg?f=1506250017\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 897.0392032112068,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1071528\",\n" +
                "  \"Name\": \"Catalonia Atocha\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41168664,\n" +
                "\t\"Longitude\": -3.69748011\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/541/0/original.jpg?f=1507121820\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 577.533143939394,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1541\",\n" +
                "  \"Name\": \"Tryp Atocha\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41155389,\n" +
                "\t\"Longitude\": -3.69768798\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/473/875/0/original.jpg?f=1506221806\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 628.5,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"473875\",\n" +
                "  \"Name\": \"Petit Palace Ducal Chueca\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42035339,\n" +
                "\t\"Longitude\": -3.70116949\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/503/0/original.jpg?f=1506101835\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 628.0113636363636,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"503\",\n" +
                "  \"Name\": \"Cortezo\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41364819,\n" +
                "\t\"Longitude\": -3.70367467\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 6,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/4/770/0/original.jpg?f=1506101926\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 396.9849246231156,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"4770\",\n" +
                "  \"Name\": \"Hostal Laris\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42113,\n" +
                "\t\"Longitude\": -3.70288\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1822/667/0/original.jpg?f=1506271258\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 314.77272727272725,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1822667\",\n" +
                "  \"Name\": \"Vértice Roomspace\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.33216512,\n" +
                "\t\"Longitude\": -3.70244388\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/159/431/0/original.jpg?f=1507181417\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 625,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"159431\",\n" +
                "  \"Name\": \"Vincci Soma\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42491,\n" +
                "\t\"Longitude\": -3.67813\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/524/0/original.jpg?f=1507160225\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1541.3175046554934,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1524\",\n" +
                "  \"Name\": \"Gran Melia Fenix\",\n" +
                "  \"Category\": \"*****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42640149,\n" +
                "\t\"Longitude\": -3.68939996\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/594/0/original.jpg?f=1507120817\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 474.10013844023996,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"594\",\n" +
                "  \"Name\": \"Ayre Gran Hotel Colon\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41296201,\n" +
                "\t\"Longitude\": -3.6692445\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/3/350/0/original.jpg?f=1506101531\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 631.1363636363636,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"3350\",\n" +
                "  \"Name\": \"Nh Zurbano\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43862261,\n" +
                "\t\"Longitude\": -3.69289219\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/473/865/0/original.jpg?f=1506221806\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 680.2234636871508,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"473865\",\n" +
                "  \"Name\": \"Petit Palace Londres\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41806708,\n" +
                "\t\"Longitude\": -3.70440274\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/0/607/0/original.jpg?f=1507171616\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 846.2569832402235,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"607\",\n" +
                "  \"Name\": \"Miguel Angel\",\n" +
                "  \"Category\": \"*****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.437562,\n" +
                "\t\"Longitude\": -3.691516\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/2/362/0/original.jpg?f=1507110817\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 445.4088624942896,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"2362\",\n" +
                "  \"Name\": \"Nuevo Madrid\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.46967379,\n" +
                "\t\"Longitude\": -3.66944432\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/4/690/0/original.jpg?f=1506101917\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 737.3631284916202,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"4690\",\n" +
                "  \"Name\": \"Petit Palace Cliper Gran Vía\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4196632,\n" +
                "\t\"Longitude\": -3.70366395\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/89/423/0/original.jpg?f=1506141656\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 897.0052635082781,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"89423\",\n" +
                "  \"Name\": \"Vincci Via 66\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42241781,\n" +
                "\t\"Longitude\": -3.70897472\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/6/091/0/original.jpg?f=1507121622\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 503.8602101416172,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"6091\",\n" +
                "  \"Name\": \"Exe Puerta Castilla\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.467368,\n" +
                "\t\"Longitude\": -3.68963063\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1429/143/0/original.jpg?f=1506251704\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 744.7150837988827,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1429143\",\n" +
                "  \"Name\": \"Vincci Centrum\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41757122,\n" +
                "\t\"Longitude\": -3.69858743\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/3/367/0/original.jpg?f=1506101534\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 621.4318181818181,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"3367\",\n" +
                "  \"Name\": \"Petit Palace Puerta Del Sol\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4169,\n" +
                "\t\"Longitude\": -3.70481\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/443/284/0/original.jpg?f=1506220425\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 451.96590909090907,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"443284\",\n" +
                "  \"Name\": \"Urban Sea Atocha 113\",\n" +
                "  \"Category\": \"*\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41016,\n" +
                "\t\"Longitude\": -3.69445\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/3/368/0/original.jpg?f=1506101534\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 787.2210213076556,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"3368\",\n" +
                "  \"Name\": \"Petit Palace Italia-Gran Via\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.420445,\n" +
                "\t\"Longitude\": -3.703026\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201505/the-roof-terrace-2.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1115.6657355679702,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"80534\",\n" +
                "  \"Name\": \"Me Madrid\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41464,\n" +
                "\t\"Longitude\": -3.70132\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 9,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201502/fachada6.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 721.6536312849162,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"4531\",\n" +
                "  \"Name\": \"Intur Palacio San Martin\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41860339,\n" +
                "\t\"Longitude\": -3.70677799\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/547/0/original.jpg?f=1507070216\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 771.1359404096834,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1547\",\n" +
                "  \"Name\": \"Tryp Madrid Cibeles\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.420357,\n" +
                "\t\"Longitude\": -3.704098\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/555/0/original.jpg?f=1506110111\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 686.3128491620112,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1555\",\n" +
                "  \"Name\": \"Rex\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4208,\n" +
                "\t\"Longitude\": -3.706856\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/289/495/0/original.jpg?f=1506211928\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 498.2297852900868,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"289495\",\n" +
                "  \"Name\": \"Nuevo Boston\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.44924947,\n" +
                "\t\"Longitude\": -3.57696176\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 9,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/531/0/original.jpg?f=1506110104\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1265.5959031657355,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1531\",\n" +
                "  \"Name\": \"Melia Madrid Princesa\",\n" +
                "  \"Category\": \"*****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42726312,\n" +
                "\t\"Longitude\": -3.71406019\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1822/666/0/original.jpg?f=1506271257\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 427.0833333333333,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1822666\",\n" +
                "  \"Name\": \"Tryp Madrid Airport Suites\",\n" +
                "  \"Category\": \"**\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.4480317,\n" +
                "\t\"Longitude\": -3.5466922\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/125/795/0/original.jpg?f=1506150259\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1065.6,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"125795\",\n" +
                "  \"Name\": \"Iberostar Las Letras Gran Vía\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41956109,\n" +
                "\t\"Longitude\": -3.69944751\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/95/448/0/original.jpg?f=1506141742\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 582.3863636363636,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"95448\",\n" +
                "  \"Name\": \"Abba Madrid\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43896,\n" +
                "\t\"Longitude\": -3.67284\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/salo-alta-resol-3.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 463.7281910009183,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"125571\",\n" +
                "  \"Name\": \"Aparthotel G3 Galeon\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.45875017,\n" +
                "\t\"Longitude\": -3.69927317\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 0,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1797/633/0/original.jpg?f=1506261211\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 932.1117318435754,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1797633\",\n" +
                "  \"Name\": \"Petit Palace Lealtad Plaza\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41652,\n" +
                "\t\"Longitude\": -3.69101\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/514/416/0/original.jpg?f=1506221814\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 494.97727272727275,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"514416\",\n" +
                "  \"Name\": \"Petit Palace Arturo Soria\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.439116,\n" +
                "\t\"Longitude\": -3.63893\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/72/284/0/original.jpg?f=1506132039\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 654.7727272727273,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"72284\",\n" +
                "  \"Name\": \"Ac Avenida de América\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43812144,\n" +
                "\t\"Longitude\": -3.6725691\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/1/540/0/original.jpg?f=1507071417\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 555.2083333333334,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"1540\",\n" +
                "  \"Name\": \"Tryp Madrid Chamberí\",\n" +
                "  \"Category\": \"***\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43856545,\n" +
                "\t\"Longitude\": -3.70096564\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201504/tarias_room_41.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 373.6979166666667,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"2900\",\n" +
                "  \"Name\": \"Barceló Torre Arias\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43438651,\n" +
                "\t\"Longitude\": -3.63023311\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/4/290/0/original.jpg?f=1507101517\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 734.6927542560722,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"4290\",\n" +
                "  \"Name\": \"Catalonia Goya\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.42511105,\n" +
                "\t\"Longitude\": -3.68220091\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 8,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/95/460/0/original.jpg?f=1507191611\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 1021.5641528201206,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"95460\",\n" +
                "  \"Name\": \"Catalonia Gran Vía\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41954272,\n" +
                "\t\"Longitude\": -3.69934291\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosshared/hotelmedia/thumbor/uploads/hotel_photo/201506/p1010429.jpg?f=1507151736\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 694.7362510878414,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"113153\",\n" +
                "  \"Name\": \"Eco Alcala Suites\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.43753656,\n" +
                "\t\"Longitude\": -3.63160908\n" +
                "  }\n" +
                "},\n" +
                "{\n" +
                "  \"Average\": 7,\n" +
                "  \"ImageUrl\": \"http://cdn.logitravel.com/contenidosShared/fotos/agregadorHotelero/fotos_hotelV3/5/349/0/original.jpg?f=1506102031\",\n" +
                "  \"Price\": {\n" +
                "\t\"Value\": 787.1508379888268,\n" +
                "\t\"PreviousValue\": 0\n" +
                "  },\n" +
                "  \"Promotions\": [],\n" +
                "  \"Rooms\": [],\n" +
                "  \"Popularity\": 100,\n" +
                "  \"Code\": \"5349\",\n" +
                "  \"Name\": \"Petit Palace Alcala Torre\",\n" +
                "  \"Category\": \"****\",\n" +
                "  \"GeoPosition\": {\n" +
                "\t\"Latitude\": 40.41830116,\n" +
                "\t\"Longitude\": -3.6994341\n" +
                "  }\n" +
                "}]";
    }
}

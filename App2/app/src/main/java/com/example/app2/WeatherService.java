package com.example.app2;



import com.example.app2.WeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("data/2.5/weather?")
    Call<WeatherResult> getWeather(@Query("lat") String lat, @Query("lon") String lon,
                                   @Query("appid") String aap_id);
}

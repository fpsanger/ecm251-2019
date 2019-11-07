package com.example.app2.retrofit;



import com.example.app2.WeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("data/2.5/weather?")
    Call<WeatherResult> getWeatherName(@Query("q") String name, @Query("appid") String aap_id);
    //Call<WeatherResult> getWeatherCoordinate(@Query("lat") String lat,@Query("lon") String lon, @Query("appid") String aap_id);

}

package com.androidmads.openweatherapi.retrofit;

import com.androidmads.openweatherapi.WeatherService;

import java.net.URLEncoder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig(){
        this.retrofit = new Retrofit.Builder();
    }


    String encodedCityName = URLEncoder.encode(editText.getText().toString(), "UTF-8");

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/weather?q="+ encodedCityName + "&APPID=12dd06f94bdfebbe98d2789a33f636f7")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    WeatherService service = retrofit.create(WeatherService.class);
}

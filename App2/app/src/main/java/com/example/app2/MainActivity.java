package com.example.app2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    public static String AppId = "9ee8551f3d7728960c4b9b8be191e7e4";
    public static String lat = "35";
    public static String lon = "139";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText cityName = findViewById(R.id.cityName);
       final TextView resposta = findViewById(R.id.cityNameResposta2);
       Button btnBuscarCep = findViewById(R.id.btnBuscaWeather);


        btnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://api.openweathermap.org/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                WeatherService service = retrofit.create(WeatherService.class);
                Call<WeatherResult> call = service.getWeather(lat, lon, AppId);
                call.enqueue(new Callback<WeatherResult>() {
                    @Override
                    public void onResponse(@NonNull Call<WeatherResult> call,
                                           @NonNull Response<WeatherResult> response) {
                        if (response.code() == 200) {
                            WeatherResult weatherResponse = response.body();
                            assert weatherResponse != null;

                            String stringBuilder = "Country: " +
                                    weatherResponse.sys.country +
                                    "\n" +
                                    "Temperature: " +
                                    weatherResponse.main +
                                    "\n" ;

                            resposta.setText(stringBuilder);
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<WeatherResult> call, @NonNull Throwable t) {
                        Log.e("CEPService   ", "Erro ao buscar o cep:" + t.getMessage());


                        Toast.makeText(getApplicationContext(),"opa", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });




    }
}










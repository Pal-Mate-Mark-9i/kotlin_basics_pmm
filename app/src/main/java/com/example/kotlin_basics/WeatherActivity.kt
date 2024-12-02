package com.example.kotlin_basics

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_basics.model.WeatherResponse
import com.example.kotlin_basics.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherActivity : AppCompatActivity() {

    private lateinit var TextViewtemp: TextView;
    private val APIKEY = "a6f5d257af75203ecbac087c152364d2";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        TextViewtemp = findViewById(R.id.TextView_temp);

        fetchWeatherData();

    }

    private fun fetchWeatherData() {
        val retrofit = Retrofit.Builder().baseUrl("https://api.openweather.org")
            .addConverterFactory(GsonConverterFactory.create()).build();

        val weatherService = retrofit.create(WeatherService::class.java);

        val call = weatherService.getWeather("Tatabánya","metric",APIKEY);

        call.enqueue(object : Callback<WeatherResponse> {
            @Override
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if (response.isSuccessful){
                    val weatherresponse = response.body();
                    if (weatherresponse != null){
                        val weatherInfo = weatherresponse.main.temp;
                        TextViewtemp.text = weatherInfo.toString();
                    }
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("Hiba: ","Az api kérés során!")
            }
        });

    };//fun vége
//git basics
}

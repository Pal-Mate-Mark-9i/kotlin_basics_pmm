package com.example.kotlin_basics

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_basics.ui.theme.Kotlin_BasicsTheme

class MainActivity : ComponentActivity() {

    private lateinit var greetingsButton: Button;
    private lateinit var calculatorButton: Button;
    private lateinit var weatherButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        greetingsButton = findViewById(R.id.greetingButton);
        calculatorButton = findViewById(R.id.calculatorButton);
        weatherButton = findViewById(R.id.weatherButton);

        greetingsButton.setOnClickListener(){
            val intent = Intent(this,GreetingsActivity::class.java);
            startActivity(intent);
        }

        calculatorButton.setOnClickListener(){
            val intent = Intent(this,CalculatorActivity::class.java);
            startActivity(intent);
        }

        weatherButton.setOnClickListener(){
            val intent = Intent(this,WeatherActivity::class.java);
            startActivity(intent);
        }
        
        //UI elemek inicialiozállása

    }//oncreate
}//class
//változtatások elvégzése githubon bellül

package com.example.kotlin_basics.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_basics.R

class calculatorActivity : AppCompatActivity() {

    private lateinit var firstNumberEditText: EditText
    private lateinit var secondNumberEditText: EditText
    private lateinit var addButton: Button
    private lateinit var dellButton: Button
    private lateinit var sumTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        addButton = findViewById(R.id.addButton);
        dellButton = findViewById(R.id.delButton);
        sumTextView = findViewById(R.id.sumUpTextView);

        addButton.setOnClickListener(){
            sumTextView.text = "";
        }

        }
    }
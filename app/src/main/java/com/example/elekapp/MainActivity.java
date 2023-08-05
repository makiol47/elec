package com.example.elekapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.elekapp.Calc.Kalkulator;
import com.example.elekapp.ElektroNarzedzia.ElektNarzedzia;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view) {
        // Calculator
        Intent intent = new Intent(this, Kalkulator.class);
        startActivity(intent);
    }

    public void Narzedzia(View view) {
        // ElektroNarzedzia
        Intent intent = new Intent(this, ElektNarzedzia.class);
        startActivity(intent);
    }

    public void onClickButton3(View view) {
        // Schematy
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickButton4(View view) {
        // Korytka
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickButton5(View view) {
        // Notatki
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickButton6(View view) {
        // Support
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

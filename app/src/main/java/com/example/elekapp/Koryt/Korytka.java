package com.example.elekapp.Koryt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.elekapp.Koryt.Materialy.Materialy;
import com.example.elekapp.Koryt.TrasyKablowe.TrasyKablowe;
import com.example.elekapp.R;

public class Korytka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korytka);
    }

    public void onClickTrasy(View view){
        Intent intent = new Intent(this, TrasyKablowe.class);
        startActivity(intent);
    }

    public void onClickMaterial(View view){
        Intent intent = new Intent(this, Materialy.class);
        startActivity(intent);
    }
}
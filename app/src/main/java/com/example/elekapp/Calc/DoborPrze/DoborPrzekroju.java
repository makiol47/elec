package com.example.elekapp.Calc.DoborPrze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class DoborPrzekroju extends AppCompatActivity {
    private EditText editTextPrad;
    private EditText editTextDlugosc;
    private EditText editTextStratyNapiecia;
    private Button buttonOblicz;
    private TextView textViewWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobor_przekroju);
        editTextPrad = findViewById(R.id.Prad);
        editTextDlugosc = findViewById(R.id.dlugos);
        editTextStratyNapiecia = findViewById(R.id.StratyNapiecia);
        buttonOblicz = findViewById(R.id.Oblicz);
        textViewWynik = findViewById(R.id.odpow);

        buttonOblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczPrzekrojPrzewodu();
            }
        });
    }

    private void obliczPrzekrojPrzewodu() {
        double prad = Double.parseDouble(editTextPrad.getText().toString());
        double dlugosc = Double.parseDouble(editTextDlugosc.getText().toString());
        double stratyNapiecia = Double.parseDouble(editTextStratyNapiecia.getText().toString());

        double przekrojPrzewodu = (prad * dlugosc * stratyNapiecia) / 1000.0;

        String wynik = "Zalecany przekrój przewodu: " + przekrojPrzewodu + " mm^2";
        textViewWynik.setText(wynik);

    }
}
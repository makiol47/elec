package com.example.elekapp.Calc.SpadkiNapeicia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class SpadkiU extends AppCompatActivity {

    private EditText vv, ii;
    private TextView ansr;
    private Button wynik;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spadeku);

        vv = findViewById(R.id.vv);
        ii = findViewById(R.id.ii);
        ansr = findViewById(R.id.answ);

        wynik = findViewById(R.id.wynik);
        wynik.setOnClickListener(view ->clct());

    }
    public void clct(){
        String resistanceText = vv.getText().toString();
        String voltageText = ii.getText().toString();

        if (!resistanceText.isEmpty() && !voltageText.isEmpty()) {
            double volt = Double.parseDouble(resistanceText);
            double amp = Double.parseDouble(voltageText);

            double current = volt * amp;

            ansr.setText("Current: " + current + " Ohm");
        } else {
            ansr.setText("Please enter values for V and R");
        }
    }
}
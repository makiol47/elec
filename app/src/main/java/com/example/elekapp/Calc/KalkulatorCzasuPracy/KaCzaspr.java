package com.example.elekapp.Calc.KalkulatorCzasuPracy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class KaCzaspr extends AppCompatActivity {

    private EditText editTextVoltage;
    private EditText editTextCharge;
    private Button buttonCalculate;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextVoltage = findViewById(R.id.editTextVoltage);
        editTextCharge = findViewById(R.id.editTextCharge);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWork();
            }
        });
    }

    private void calculateWork() {
        String voltageStr = editTextVoltage.getText().toString();
        String chargeStr = editTextCharge.getText().toString();

        if (voltageStr.isEmpty() || chargeStr.isEmpty()) {
            textViewResult.setText("Wprowadź napięcie i ładunek!");
            return;
        }

        try {
            double voltage = Double.parseDouble(voltageStr);
            double charge = Double.parseDouble(chargeStr);

            double work = voltage * charge;
            textViewResult.setText("Praca elektryczna: " + work + " J");
        } catch (NumberFormatException e) {
            textViewResult.setText("Niepoprawne dane wejściowe!");
        }
    }
}
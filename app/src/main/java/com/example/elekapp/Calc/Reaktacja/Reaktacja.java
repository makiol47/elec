package com.example.elekapp.Calc.Reaktacja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class Reaktacja extends AppCompatActivity {

    private EditText editTextResistance;
    private EditText editTextInductance;
    private EditText editTextCapacitance;
    private Button buttonCalculate;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextResistance = findViewById(R.id.editTextResistance);
        editTextInductance = findViewById(R.id.editTextInductance);
        editTextCapacitance = findViewById(R.id.editTextCapacitance);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateReactance();
            }
        });
    }

    private void calculateReactance() {
        String resistanceStr = editTextResistance.getText().toString();
        String inductanceStr = editTextInductance.getText().toString();
        String capacitanceStr = editTextCapacitance.getText().toString();

        if (resistanceStr.isEmpty()) {
            textViewResult.setText("Wprowadź wartość oporu!");
            return;
        }

        try {
            double resistance = Double.parseDouble(resistanceStr);
            double inductance = !inductanceStr.isEmpty() ? Double.parseDouble(inductanceStr) : 0;
            double capacitance = !capacitanceStr.isEmpty() ? Double.parseDouble(capacitanceStr) : 0;

            double inductiveReactance = 2 * Math.PI * inductance;
            double capacitiveReactance = 1 / (2 * Math.PI * capacitance);

            double totalReactance = Math.sqrt(Math.pow(resistance, 2) + Math.pow(inductiveReactance - capacitiveReactance, 2));
            textViewResult.setText("Reaktancja: " + totalReactance + " Ω");
        } catch (NumberFormatException e) {
            textViewResult.setText("Niepoprawne dane wejściowe!");
        }
    }
}

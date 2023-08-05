package com.example.elekapp.Calc.PrawoOhma;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.elekapp.R;

public class PrawoOhmaActivity extends AppCompatActivity {

    private EditText resistanceEditText, currentEditText, voltageEditText;
    private TextView answer;
    private Button resistanceButton, currentButton, voltageButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prawo_ohma);

        resistanceEditText = findViewById(R.id.Resistance);
        currentEditText = findViewById(R.id.Current);
        voltageEditText = findViewById(R.id.Voltage);
        answer = findViewById(R.id.result);

        resistanceButton = findViewById(R.id.resistanceButton);
        resistanceButton.setOnClickListener(view -> calculateResistance());

        currentButton = findViewById(R.id.currentButton);
        currentButton.setOnClickListener(view -> calculateCurrent());

        voltageButton = findViewById(R.id.voltageButton);
        voltageButton.setOnClickListener(view -> calculateVoltage());
    }

    private void calculateResistance() {
        String currentText = currentEditText.getText().toString();
        String voltageText = voltageEditText.getText().toString();

        if (!currentText.isEmpty() && !voltageText.isEmpty()) {
            double current = Double.parseDouble(currentText);
            double voltage = Double.parseDouble(voltageText);

            double resistance = voltage / current;

            answer.setText("Resistance: " + resistance + " ohms");
        } else {
            answer.setText("Please enter values for Current and Voltage");
        }
    }

    private void calculateCurrent() {
        String resistanceText = resistanceEditText.getText().toString();
        String voltageText = voltageEditText.getText().toString();

        if (!resistanceText.isEmpty() && !voltageText.isEmpty()) {
            double resistance = Double.parseDouble(resistanceText);
            double voltage = Double.parseDouble(voltageText);

            double current = voltage / resistance;

            answer.setText("Current: " + current + " amps");
        } else {
            answer.setText("Please enter values for Resistance and Voltage");
        }
    }

    private void calculateVoltage() {
        String resistanceText = resistanceEditText.getText().toString();
        String currentText = currentEditText.getText().toString();

        if (!resistanceText.isEmpty() && !currentText.isEmpty()) {
            double resistance = Double.parseDouble(resistanceText);
            double current = Double.parseDouble(currentText);

            double voltage = resistance * current;

            answer.setText("Voltage: " + voltage + " volts");
        } else {
            answer.setText("Please enter values for Resistance and Current");
        }
    }
}

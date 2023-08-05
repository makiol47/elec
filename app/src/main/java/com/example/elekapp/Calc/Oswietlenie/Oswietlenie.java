package com.example.elekapp.Calc.Oswietlenie;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.elekapp.R;

import java.text.DecimalFormat;

public class Oswietlenie extends AppCompatActivity {

    private EditText inputPower, inputEfficiency;
    private Button calculateButton;
    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oswietlenie);

        inputPower = findViewById(R.id.input_power);
        inputEfficiency = findViewById(R.id.input_efficiency);
        calculateButton = findViewById(R.id.calculate_button);
        resultTextView = findViewById(R.id.result_text);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLighting();
            }
        });
    }

    private void calculateLighting() {
        String powerStr = inputPower.getText().toString();
        double power = Double.parseDouble(powerStr);

        String efficiencyStr = inputEfficiency.getText().toString();
        double efficiency = Double.parseDouble(efficiencyStr);

        double lighting = power * efficiency;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String lightingStr = decimalFormat.format(lighting);

        resultTextView.setText("Lighting: " + lightingStr + " lumens");
    }
}
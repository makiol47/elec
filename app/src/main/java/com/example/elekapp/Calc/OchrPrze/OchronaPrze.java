package com.example.elekapp.Calc.OchrPrze;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.elekapp.R;

public class OchronaPrze extends AppCompatActivity {

    private EditText editTextVoltage;
    private Button buttonCalculate;
    private TextView textViewResult;

    private final double MAX_VOLTAGE = 220.0; // Próg napięcia, powyżej którego jest przepięcie

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextVoltage = findViewById(R.id.editTextVoltage);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVoltage();
            }
        });
    }

    private void calculateVoltage() {
        String voltageStr = editTextVoltage.getText().toString();

        if (voltageStr.isEmpty()) {
            textViewResult.setText("Wprowadź wartość napięcia!");
            return;
        }

        try {
            double voltage = Double.parseDouble(voltageStr);

            if (voltage > MAX_VOLTAGE) {
                textViewResult.setText("Przepięcie! Napięcie przekroczyło próg: " + MAX_VOLTAGE + " V");
                Toast.makeText(this, "Ostrzeżenie: Przepięcie!", Toast.LENGTH_LONG).show();
            } else {
                textViewResult.setText("Napięcie: " + voltage + " V");
            }
        } catch (NumberFormatException e) {
            textViewResult.setText("Niepoprawne dane wejściowe!");
        }
    }
}
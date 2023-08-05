package com.example.elekapp.Calc.Konwersja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.elekapp.R;

import java.text.DecimalFormat;

public class Konwersja extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText inputUnitValue;
    private TextView resultTextView;
    private String selectedUnit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konwersja);

        inputUnitValue = findViewById(R.id.input_value);
        Button convertButton = findViewById(R.id.convert_button);
        resultTextView = findViewById(R.id.result_text);
        Spinner unitSpinner = findViewById(R.id.unit_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.units_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner.setAdapter(adapter);
        unitSpinner.setOnItemSelectedListener(this);
        adapter.notifyDataSetChanged();

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnit();
            }
        });
    }

    private void convertUnit() {
        String inputValueStr = inputUnitValue.getText().toString();

        if (inputValueStr.isEmpty()) {
            return;
        }

        double inputValue = Double.parseDouble(inputValueStr);

        double result = 0.0;

        switch (selectedUnit) {
            case "Ampere to Milliampere":
            case "Kilowatt to Watt":
                result = inputValue * 1000;
                break;
            case "Milliampere to Ampere":
                result = inputValue / 1000;
                break;
            case "Ampere to Microampere":
            case "Farad to Microfarad":
                result = inputValue * 1000000;
                break;
            case "Microampere to Ampere":
                result = inputValue / 1000000;
                break;
            case "Ampere to Kilowatt":
                result = inputValue / 1000;
                break;
            case "Millicoulomb to Microcoulomb":
                result = inputValue * 1000;
                break;
            case "Kilowatt to Megawatt":
                result = inputValue / 1000;
                break;
            case "Nanowatt to Milliwatt":
                result = inputValue / 1000000;
                break;
            case "Microampere to Nanoampere":
                result = inputValue * 1000;
                break;
            case "Watt to Kilowatt":
                result = inputValue / 1000;
                break;
            case "Kilowatt to Mechanical Horsepower":
                result = inputValue * 1.341;
                break;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultStr = decimalFormat.format(result);

        resultTextView.setText(resultStr);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedUnit = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

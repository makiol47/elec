package com.example.elekapp.Calc.MocE;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class Moc extends AppCompatActivity {

    private EditText volt, amp;
    private TextView odp;
    private Button but;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moc);

        volt = findViewById(R.id.Volt);
        amp = findViewById(R.id.Amper);
        odp = findViewById(R.id.Odp);

        but = findViewById(R.id.odpo);
        but.setOnClickListener(view -> calculate());

    }
    public void calculate(){
        String resistanceText = volt.getText().toString();
        String voltageText = amp.getText().toString();

        if (!resistanceText.isEmpty() && !voltageText.isEmpty()) {
            double volt = Double.parseDouble(resistanceText);
            double amp = Double.parseDouble(voltageText);

            double current = volt * amp;

            odp.setText("Current: " + current + " W");
        } else {
            odp.setText("Please enter values for Voltage and Amper");
        }

    }

}
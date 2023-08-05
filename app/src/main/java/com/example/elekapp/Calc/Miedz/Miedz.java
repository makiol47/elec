package com.example.elekapp.Calc.Miedz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.elekapp.R;

public class Miedz extends AppCompatActivity {

    private EditText inputDlugosc, inputPrzekroj, inputLiczbaZyl;
    private Button buttonOblicz;
    private TextView outputWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miedz);

        inputDlugosc = findViewById(R.id.dglsc);
        inputPrzekroj = findViewById(R.id.przkrj);
        inputLiczbaZyl = findViewById(R.id.ilscz);
        buttonOblicz = findViewById(R.id.odp);
        outputWynik = findViewById(R.id.anwr);

        buttonOblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczIloscMiedzi();
            }
        });
    }

    private void obliczIloscMiedzi() {
        String dlugoscStr = inputDlugosc.getText().toString();
        double dlugosc = Double.parseDouble(dlugoscStr);

        String przekrojStr = inputPrzekroj.getText().toString();
        double przekroj = Double.parseDouble(przekrojStr);

        String liczbaZylStr = inputLiczbaZyl.getText().toString();
        int liczbaZyl = Integer.parseInt(liczbaZylStr);

        double iloscMiedziWG = obliczIloscMiedziKabla(dlugosc, przekroj, liczbaZyl);

        String wynikStr = String.valueOf(iloscMiedziWG) + "Gramow";
        outputWynik.setText(wynikStr);
    }

    private double obliczIloscMiedziKabla(double dlugosc, double przekroj, int liczbaZyl) {
        double wspolczynnikMiedzi = 8.9;

        double powierzchnia = przekroj / 1000000;
        double iloscMiedziWKg = dlugosc * powierzchnia * wspolczynnikMiedzi * liczbaZyl;
        double iloscMiedziWG = iloscMiedziWKg * 1000;

        return iloscMiedziWG;

    }
}



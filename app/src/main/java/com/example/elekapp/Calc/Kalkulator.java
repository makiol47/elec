package com.example.elekapp.Calc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.elekapp.Calc.DoborPrze.DoborPrzekroju;
import com.example.elekapp.Calc.KalkulatorCzasuPracy.KaCzaspr;
import com.example.elekapp.Calc.Konwersja.Konwersja;
import com.example.elekapp.Calc.Miedz.Miedz;
import com.example.elekapp.Calc.MocE.Moc;
import com.example.elekapp.Calc.OchrPrze.OchronaPrze;
import com.example.elekapp.Calc.Oswietlenie.Oswietlenie;
import com.example.elekapp.Calc.PrawoOhma.PrawoOhmaActivity;
import com.example.elekapp.Calc.SpadkiNapeicia.SpadkiU;
import com.example.elekapp.R;

public class Kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcul);
    }

    public void onClickPrawoOhma(View view) {
        // Prawo Ohma
        Intent intent = new Intent(this, PrawoOhmaActivity.class);
        startActivity(intent);
    }

    public void onClickObliczanieMocy(View view) {
        // Moc Czynna
        Intent intent = new Intent(this, Moc.class);
        startActivity(intent);
    }

    public void onClickSpadekU(View view) {
        // Spadki U
        Intent intent = new Intent(this, SpadkiU.class);
        startActivity(intent);

    }

    public void onClickMiedz(View view) {
        // Miedz
        Intent intent = new Intent(this, Miedz.class);
        startActivity(intent);

    }

    public void onClickWybor(View view) {
        // Dobor Przewodu
        Intent intent = new Intent(this, DoborPrzekroju.class);
        startActivity(intent);

    }

    public void onClickKonwersja(View view) {
        //Konwersja
        Intent intent = new Intent(this, Konwersja.class);
        startActivity(intent);

    }

    public void onClickOswietlenie(View view) {
        //Oswietlenie
        Intent intent = new Intent(this, Oswietlenie.class);
        startActivity(intent);

    }

    public void onClickKCP(View view) {
        //KalkulatorCzasPracy
        Intent intent = new Intent(this, KaCzaspr.class);
        startActivity(intent);
    }
    public void onClickOchrP(View view){
        //Ochrona Przepieciowa
        Intent intent = new Intent(this, OchronaPrze.class);
        startActivity(intent);
    }
}


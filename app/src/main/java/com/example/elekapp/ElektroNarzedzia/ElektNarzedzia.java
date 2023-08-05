package com.example.elekapp.ElektroNarzedzia;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.example.elekapp.ElektroNarzedzia.Agregat.Agrega;
import com.example.elekapp.ElektroNarzedzia.Bruzdownica.Bruzd;
import com.example.elekapp.ElektroNarzedzia.Dalmierze.DLaserowy;
import com.example.elekapp.ElektroNarzedzia.Dalmierze.DUltradz;
import com.example.elekapp.ElektroNarzedzia.Dremel.Dremel;
import com.example.elekapp.ElektroNarzedzia.Dynanometr.Dynanoo;
import com.example.elekapp.ElektroNarzedzia.Frezarka.Frezarka;
import com.example.elekapp.ElektroNarzedzia.GilotynaMetal.GilotynaMetal;
import com.example.elekapp.ElektroNarzedzia.KluczUda.KluczUdarowy;
import com.example.elekapp.ElektroNarzedzia.MiaraOdleg.Metrowka;
import com.example.elekapp.ElektroNarzedzia.Mierniki.*;
import com.example.elekapp.ElektroNarzedzia.MlotUdar.Udarowy;
import com.example.elekapp.ElektroNarzedzia.Nasadki.Nasady;
import com.example.elekapp.ElektroNarzedzia.Odkurzacze.Odkur;
import com.example.elekapp.ElektroNarzedzia.PilaTarczowya.PilaTarczowa;
import com.example.elekapp.ElektroNarzedzia.Praska.Praska;
import com.example.elekapp.ElektroNarzedzia.Spawarka.Spawa;
import com.example.elekapp.ElektroNarzedzia.Suwmiarka.Suwmiara;
import com.example.elekapp.ElektroNarzedzia.Szlifierki.Szlifiera;
import com.example.elekapp.ElektroNarzedzia.Wiertarka.Wiertara;
import com.example.elekapp.ElektroNarzedzia.WiertarkaStolowa.WierStolowa;
import com.example.elekapp.ElektroNarzedzia.WiertarkoWkretarka.WkreWier;
import com.example.elekapp.ElektroNarzedzia.Wyrzynarka.Wyrzynarka;
import com.example.elekapp.ElektroNarzedzia.ZacieraczkaDoBet.ZacDoBet;
import com.example.elekapp.R;

public class ElektNarzedzia extends Activity {

    private EditText searchEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elekt_narzedzia);

        searchEditText = findViewById(R.id.searchEditText);
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String searchQuery = charSequence.toString().trim().toLowerCase();
                scrollToButtonWithText(searchQuery);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void scrollToButtonWithText(String searchQuery) {
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childView = linearLayout.getChildAt(i);
            if (childView instanceof Button) {
                Button button = (Button) childView;
                String buttonText = button.getText().toString().trim().toLowerCase();
                if (buttonText.contains(searchQuery)) {
                    button.requestFocus();
                    ScrollView scrollView = findViewById(R.id.scrollView);
                    scrollView.scrollTo(0, button.getTop());
                    break;
                }
            }
        }
    }

    // Obsługa kliknięcia przycisku "Bruzdownica"
    public void onClickBruzdownica(View view) {
        // Bruzdownica
        Intent intent = new Intent(this, Bruzd.class);
        startActivity(intent);
    }

    public void onClickDalmierzLaserowy(View view) {
        // Dalmierz Laserowy
        Intent intent = new Intent(this, DLaserowy.class);
        startActivity(intent);
    }

    public void onClickDalmierzUltra(View view){
       // Dalmierz Ultradzwiekowy
        Intent intent = new Intent(this, DUltradz.class);
        startActivity(intent);
    }

    public void onClickDremel(View view){
        // Dalmierz Optyczny
        Intent intent = new Intent(this, Dremel.class);
        startActivity(intent);
    }

    public void onClickDynamo(View view){
        // Dynamometr
        Intent intent = new Intent(this, Dynanoo.class);
        startActivity(intent);
    }

    public void onClickFrezarka(View view){
        // Frezaka
        Intent intent = new Intent(this, Frezarka.class);
        startActivity(intent);
    }

    public void onClickGilotynaMetal(View view){
        // GIlotyna Metal
        Intent intent = new Intent(this, GilotynaMetal.class);
        startActivity(intent);
    }

    public void onClickKluczUdarowy(View view){
        // Klucz udarowy
        Intent intent = new Intent(this, KluczUdarowy.class);
        startActivity(intent);
    }

    public void onClickMetrowka(View view){
        // Metrowka
        Intent intent = new Intent(this, Metrowka.class);
        startActivity(intent);
    }

    public void onClickAmperomierz(View view){
        // Amperomierz
        Intent intent = new Intent(this, Amperomierz.class);
        startActivity(intent);
    }

    public void onClickVoltomierz(View view){
        // Voltomierz
        Intent intent = new Intent(this, Amperomierz.class);
        startActivity(intent);
    }

    public void onClickOhmmetr(View view){
        // Ohnmetr
        Intent intent = new Intent(this, Ohmmetr.class);
        startActivity(intent);
    }

    public void onClickWatomierz(View view){
        // Watomierz
        Intent intent = new Intent(this, Watomierz.class);
        startActivity(intent);
    }

    public void onClickMultimetr(View view){
        // Multimetr
        Intent intent = new Intent(this, Multimetr.class);
        startActivity(intent);
    }

    public void onClickMiernikHz(View view){
        // MiernikHZ
        Intent intent = new Intent(this, MiernikHZ.class);
        startActivity(intent);
    }

    public void onClickMiernikizolacji(View view){
        // Miernik Izolacji
        Intent intent = new Intent(this, MiernikIzolacji.class);
        startActivity(intent);
    }

    public void onClickMierniknatężeniapolaelektromagnetycznego(View view){
        // Miernik Natezenia Pola Elektromagnetycznego
        Intent intent = new Intent(this, MiernikNatężeniaPolaElektromagnetycznego.class);
        startActivity(intent);
    }

    public void onClickAnalizatormocy(View view){
        // Analizator Mocy
        Intent intent = new Intent(this, AnalizatorMocy.class);
        startActivity(intent);
    }

    public void onClickMlotUdarowy(View view){
        // Mlot Udarowy
        Intent intent = new Intent(this, Udarowy.class );
        startActivity(intent);
    }

    public void onClickOdkurzacz(View view){
        // Odkurzacz
        Intent intent = new Intent(this, Odkur.class);
        startActivity(intent);
    }

    public void onClickPilaTarczowa(View view){
        // Pila
        Intent intent = new Intent(this, PilaTarczowa.class);
        startActivity(intent);
    }

    public void onClickPraska(View view){
        // Praska
        Intent intent = new Intent(this, Praska.class);
        startActivity(intent);
    }

    public void onClickSuwmiarka(View view){
        // Suwmiarka
        Intent intent = new Intent(this, Suwmiara.class);
        startActivity(intent);
    }

    public void onClickSzlifierka(View view){
        // Szlifierka
        Intent intent = new Intent(this, Szlifiera.class);
        startActivity(intent);
    }

    public void onClickWiertarka(View view){
        // Wiertarka
        Intent intent = new Intent(this, Wiertara.class);
        startActivity(intent);
    }

    public void onClickWkretarka(View view){
        // Wkretarka
        Intent intent = new Intent(this, WkreWier.class);
        startActivity(intent);
    }

    public void onClickWierSto(View view){
        // Wiertarka Stolowa
        Intent intent = new Intent(this, WierStolowa.class);
        startActivity(intent);
    }

    public void onClickWyrzynarka(View view){
        // Wyrzynarka
        Intent intent = new Intent(this, Wyrzynarka.class);
        startActivity(intent);
    }

    public void onZacieraczkaDoBetonu(View view){
        // ZacDoBet
        Intent intent = new Intent(this, ZacDoBet.class);
        startActivity(intent);
    }

    public void onClickNasadka(View view){
        // Nasadka
        Intent intent = new Intent(this, Nasady.class);
        startActivity(intent);
    }

    public void onClickAgregat(View view){
        // Agregat
        Intent intent = new Intent(this, Agrega.class);
        startActivity(intent);
    }

    public void onClickSpawarka(View view){
        // Spawarka
        Intent intent = new Intent(this, Spawa.class);
        startActivity(intent);
    }


}

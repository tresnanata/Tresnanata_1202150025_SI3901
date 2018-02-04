package com.example.tresnanata.igustipututresnanata_120215025_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {
    TextView textRestoran, textLauk, textPorsi, textHarga;
    String restoran, lauk;
    int porsi, harga;
    int modalKencan=65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            textRestoran =(TextView)findViewById(R.id.text_restauran);
            textLauk =(TextView)findViewById(R.id.text_menu);
            textPorsi =(TextView)findViewById(R.id.teks_porsi);
            textHarga =(TextView)findViewById(R.id.teks_harga);

            Intent intent = getIntent();
            restoran = intent.getStringExtra("restaurant");
            lauk = intent.getStringExtra("lauk");
            porsi = intent.getIntExtra("portion", 0);
            harga = intent.getIntExtra("price", 0);

            textRestoran.setText(restoran);
            textLauk.setText(lauk);
            textPorsi.setText(""+porsi);
            textHarga.setText("Rp."+harga);

            Toast toast = null;
            if (harga < modalKencan){
                toast = Toast.makeText(getApplicationContext(), "Makan disini aja atuh", Toast.LENGTH_SHORT);
            }else{
                toast = Toast.makeText(getApplicationContext(), "Jangan disini, terlalu mahal", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }
package com.example.tresnanata.igustipututresnanata_120215025_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editlauk, editPorsi;
    Intent intent;
    String restoran, lauk;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editlauk = (EditText) findViewById(R.id.edit_lauk);
        editPorsi = (EditText) findViewById(R.id.edit_porsi);
        intent = new Intent (this,SecondActivity.class);
    }

    public void onEatbus(View view) {
        lauk= editlauk.getText().toString();
        restoran = "Eatbus";
        porsi = Integer.parseInt(editPorsi.getText().toString());
        int total = 50000 * Integer.parseInt(editPorsi.getText().toString());
        intent.putExtra("restaurant",restoran);
        intent.putExtra("lauk",lauk);
        intent.putExtra("portion",porsi);
        intent.putExtra("price",total);

        startActivity(intent);
    }

    public void onAbnormal(View view) {
        lauk = editlauk.getText().toString();
        restoran = "Abnormal";
        porsi = Integer.parseInt(editPorsi.getText().toString());
        int total = 30000 * Integer.parseInt(editPorsi.getText().toString());

        intent.putExtra("restoran",restoran);
        intent.putExtra("menu",lauk);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga",total);

        startActivity(intent);
    }
}


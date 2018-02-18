package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button btnPertama;
    Button btnKedua;
    Button btnKetiga;
    Button btnKeempat;
    Button btnKelima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu_utama);

        btnPertama = (Button) findViewById(R.id.btnPertama);
        btnPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSubBab1.class);
                startActivity(intent);

            }
        });

        btnKedua = (Button) findViewById(R.id.btnKedua);
        btnKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSubBab2.class);
                startActivity(intent);

            }
        });

        btnKetiga = (Button) findViewById(R.id.btnKetiga);
        btnKetiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSubBab3.class);
                startActivity(intent);

            }
        });

        btnKeempat = (Button) findViewById(R.id.btnKeempat);
        btnKeempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSubBab4.class);
                startActivity(intent);

            }
        });

        btnKelima = (Button) findViewById(R.id.btnKelima);
        btnKelima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSubBab4.class);
                startActivity(intent);

            }
        });

    }
}

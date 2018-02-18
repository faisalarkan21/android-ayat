package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub6);

        Button btnAgama= (Button) findViewById(R.id.btnAgama);
        btnAgama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK1.class);
                startActivity(intent);

            }
        });

        Button btnImantandatanda= (Button) findViewById(R.id.btnImantandatanda);
        btnImantandatanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK2.class);
                startActivity(intent);

            }
        });

        Button btnIslamMuslim= (Button) findViewById(R.id.btnIslamMuslim);
        btnIslamMuslim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK3.class);
                startActivity(intent);

            }
        });

        Button btnMunafikPerilaku= (Button) findViewById(R.id.btnMunafikPerilaku);
        btnMunafikPerilaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK4.class);
                startActivity(intent);

            }
        });

        Button btnSyirikMusyrik= (Button) findViewById(R.id.btnSyirikMusyrik);
        btnSyirikMusyrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK5.class);
                startActivity(intent);


            }
        });

        Button btnKafirPerilaku= (Button) findViewById(R.id.btnKafirPerilaku);
        btnKafirPerilaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK6.class);
                startActivity(intent);

            }
        });


        Button btnOrangOrangYahudi= (Button) findViewById(R.id.btnOrangOrangYahudi);
        btnOrangOrangYahudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab6.this, MenuInnerBabRMMK7.class);
                startActivity(intent);

            }
        });


    }
}

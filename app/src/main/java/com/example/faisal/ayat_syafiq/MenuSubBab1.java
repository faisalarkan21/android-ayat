package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub1);

        Button btnSifatAllah= (Button) findViewById(R.id.btnSifatAllah);
        btnSifatAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab1.this, MenuInnerBab1.class);
                startActivity(intent);

            }
        });

        Button btnTuhanSemesta= (Button) findViewById(R.id.btnTuhanSemesta);
        btnTuhanSemesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab1.this, MenuInnerBab2.class);
                startActivity(intent);

            }
        });

        Button btnHidayahdanRahmat= (Button) findViewById(R.id.btnHidayahdanRahmat);
        btnHidayahdanRahmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab1.this, MenuInnerBab3.class);
                startActivity(intent);

            }
        });

        Button btnNikmatLaknatdanAzabAllah= (Button) findViewById(R.id.btnNikmatLaknatdanAzabAllah);
        btnNikmatLaknatdanAzabAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab1.this, MenuInnerBab4.class);
                startActivity(intent);

            }
        });





    }
}

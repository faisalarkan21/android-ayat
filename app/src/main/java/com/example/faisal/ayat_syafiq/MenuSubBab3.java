package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub3);

        Button btnAsalUsulManusia= (Button) findViewById(R.id.btnAsalUsulManusia);
        btnAsalUsulManusia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab3.this, MenuInnerBabMdP1.class);
                startActivity(intent);

            }
        });

        Button btnDinamikaKehidupan= (Button) findViewById(R.id.btnDinamikaKehidupan);
        btnDinamikaKehidupan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab3.this, MenuInnerBabMdP2.class);
                startActivity(intent);

            }
        });

        Button btnJiwaAkalNafsu= (Button) findViewById(R.id.btnJiwaAkalNafsu);
        btnJiwaAkalNafsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab3.this, MenuInnerBabMdP3.class);
                startActivity(intent);

            }
        });

    }
}

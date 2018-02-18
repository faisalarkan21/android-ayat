package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub5);

        Button btnMalaikatMalaikat= (Button) findViewById(R.id.btnMalaikatMalaikat);
        btnMalaikatMalaikat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab5.this, MenuInnerBabYPTDYPL1.class);
                startActivity(intent);

            }
        });

        Button btnIblisdanJin= (Button) findViewById(R.id.btnIblisdanJin);
        btnIblisdanJin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab5.this, MenuInnerBabYPTDYPL2.class);
                startActivity(intent);

            }
        });

        Button btnSetandanPara= (Button) findViewById(R.id.btnSetandanPara);
        btnSetandanPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab5.this, MenuInnerBabYPTDYPL3.class);
                startActivity(intent);

            }
        });

    }
}

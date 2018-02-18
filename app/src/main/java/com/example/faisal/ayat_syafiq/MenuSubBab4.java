package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub4);

        Button btnLangitBumi= (Button) findViewById(R.id.btnLangitBumi);
        btnLangitBumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab4.this, MenuInnerBabAS1.class);
                startActivity(intent);

            }
        });

        Button btnMatahariBulanSiang= (Button) findViewById(R.id.btnMatahariBulanSiang);
        btnMatahariBulanSiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab4.this, MenuInnerBabAS2.class);
                startActivity(intent);

            }
        });

        Button btnAnginHujanHewan= (Button) findViewById(R.id.btnAnginHujanHewan);
        btnAnginHujanHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab4.this, MenuInnerBabAS3.class);
                startActivity(intent);

            }
        });

    }
}

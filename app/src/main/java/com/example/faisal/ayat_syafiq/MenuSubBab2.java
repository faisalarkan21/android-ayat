package com.example.faisal.ayat_syafiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSubBab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub2);

        Button btnKenapaAlQuran= (Button) findViewById(R.id.btnKenapaAlQuran);
        btnKenapaAlQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab2.this, MenuInnerBabAlQuran1.class);
                startActivity(intent);

            }
        });

        Button btnFungsiAlQuran= (Button) findViewById(R.id.btnFungsiAlQuran);
        btnFungsiAlQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSubBab2.this, MenuInnerBabAlQuran2.class);
                startActivity(intent);

            }
        });

    }
}

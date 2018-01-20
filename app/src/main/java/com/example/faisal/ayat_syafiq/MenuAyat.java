package com.example.faisal.ayat_syafiq;

import android.app.ActionBar;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MenuAyat extends AppCompatActivity {

    private SQLiteDatabase db;
    private TextView textAyat, textArti;
    int jumlahSurat ;
    static EntityQuran ayatJadi;
    Toolbar mActionBarToolbar;
    ArrayList<String> listNamaArray,listAyatArray, listSuratArray, listKeterangan ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));

        EntityQuran entity = new EntityQuran();

        LinearLayout layout = (LinearLayout)findViewById(R.id.layoutAyat);

        DAOQuran databaseAccess = DAOQuran.getInstance(this);
        databaseAccess.open();

        listAyatArray = getIntent().getStringArrayListExtra("listAyat");
        listSuratArray = getIntent().getStringArrayListExtra("listSurat");
        listNamaArray = getIntent().getStringArrayListExtra("listNama");
        listKeterangan = getIntent().getStringArrayListExtra("listKetangan");

        ayatJadi = databaseAccess.getDataQuranByAyatTest(listAyatArray, listSuratArray);
        databaseAccess.close();

        List<TextView> textListNama = new ArrayList<TextView>( listSuratArray.size());
        List<TextView> textListAyat = new ArrayList<TextView>( listSuratArray.size());
        List<TextView> textListArti = new ArrayList<TextView>( listSuratArray.size());
        List<TextView> textListKeterangan = new ArrayList<TextView>( listSuratArray.size());

        for(int i = 0; i < ayatJadi.getListAyat().size(); i++)
        {
            /*
                Nama Surat
             */

            TextView newNama = new TextView(MenuAyat.this);
            newNama.setText(listNamaArray.get(i).toString());
            newNama.setPadding(20,20,20,20);
            newNama.setTextSize(25);

            /*
                Text Ayat Arab
             */

            TextView newAyat = new TextView(MenuAyat.this);
            newAyat.setText(ayatJadi.getListAyat().get(i).toString());
            newAyat.setTextColor(Color.parseColor("#000000"));
            newAyat.setPadding(20,20,20,20);

            newAyat.setTextSize(25);

             /*
                Text Ayat Arti
             */

            TextView newArti = new TextView(MenuAyat.this);
            newArti.setText(ayatJadi.getListArti().get(i).toString().replace("&quot;", ""));
            newArti.setPadding(20,20,20,20);
            newArti.setTextSize(12);

             /*
                Text Ayat Keterangan
             */

            TextView newKeterangan = new TextView(MenuAyat.this);
            newKeterangan.setText("* " + listKeterangan.get(i).toString().replace("&quot;", ""));
            newKeterangan.setPadding(20,20,20,20);
            newKeterangan.setTextSize(12);

            // Tambah nama
            textListNama.add(newNama);
            layout.addView(newNama);

            // Tambah Ayat
            layout.addView(newAyat);
            textListAyat.add(newAyat);

            // Tambah Arti
            layout.addView(newArti);
            textListArti.add(newArti);

            // Tambah Keterangan
            layout.addView(newKeterangan);
            textListKeterangan.add(newKeterangan);

        }
    }
}

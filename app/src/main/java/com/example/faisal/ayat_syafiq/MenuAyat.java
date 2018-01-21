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
        List<TextView> textListLabelArti = new ArrayList<TextView>( listSuratArray.size());
        List<TextView> textListLabelKeterangan = new ArrayList<TextView>( listSuratArray.size());

        for(int i = 0; i < ayatJadi.getListAyat().size(); i++)
        {
            /*
                Nama Surat
             */

            TextView newNama = new TextView(MenuAyat.this);
            newNama.setText(listNamaArray.get(i).toString());
            newNama.setPadding(50,50,20,20);
            newNama.setTextColor(Color.parseColor("#000000"));
            newNama.setTextSize(20);

            /*
                Text Ayat Arab
             */

            TextView newAyat = new TextView(MenuAyat.this);
            newAyat.setText(ayatJadi.getListAyat().get(i).toString());
            newAyat.setTextColor(Color.parseColor("#000000"));
            newAyat.setPadding(20,40,50,20);
            newAyat.setLineSpacing(0,1.6f);
            newAyat.setTextSize(20);

             /*
                Text Ayat Arti
             */

            TextView newArtiLabel = new TextView(MenuAyat.this);
            newArtiLabel.setText("Artinya : ");
            newArtiLabel.setPadding(50,60,20,0);
            newArtiLabel.setTextColor(Color.parseColor("#000000"));
            newArtiLabel.setLineSpacing(0,1.5f);
            newArtiLabel.setTextSize(13);


            TextView newArti = new TextView(MenuAyat.this);
            newArti.setText(ayatJadi.getListArti().get(i).toString().replace("&quot;", ""));
            newArti.setPadding(50,20,20,20);
            newArti.setTextColor(Color.parseColor("#000000"));
            newArti.setLineSpacing(0,1.5f);
            newArti.setTextSize(15);

            TextView newKeteranganLabel = new TextView(MenuAyat.this);
            newKeteranganLabel.setText("Keterangan : ");
            newKeteranganLabel.setPadding(50,30,20,0);
            newKeteranganLabel.setTextColor(Color.parseColor("#000000"));
            newKeteranganLabel.setLineSpacing(0,1.5f);
            newKeteranganLabel.setTextSize(13);

             /*
                Text Ayat Keterangan
             */

            TextView newKeterangan = new TextView(MenuAyat.this);
            newKeterangan.setText(listKeterangan.get(i).toString().replace("&quot;", ""));
            newKeterangan.setPadding(50,20,20,20);
            newKeterangan.setTextColor(Color.parseColor("#000000"));
            newKeterangan.setTextSize(14);

            // Tambah nama
            textListNama.add(newNama);
            layout.addView(newNama);

            // Tambah Ayat
            layout.addView(newAyat);
            textListAyat.add(newAyat);

            layout.addView(newArtiLabel);
            textListLabelArti.add(newArtiLabel);

            // Tambah Arti
            layout.addView(newArti);
            textListArti.add(newArti);


            layout.addView(newKeteranganLabel);
            textListLabelKeterangan.add(newKeteranganLabel);

            // Tambah Keterangan
            layout.addView(newKeterangan);
            textListKeterangan.add(newKeterangan);



        }
    }
}

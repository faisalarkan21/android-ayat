package com.example.faisal.ayat_syafiq;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by faisal on 1/19/18.
 */

public class DAOQuran extends DBHelper {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DAOQuran instance;
    EntityQuran entity;


    private Context ctx;



    String SQLTestQuran1 = "SELECT * from `table_ayat`";

    private DAOQuran(Context context) {
        super(context);
        this.openHelper = new DBHelper(context);

    }

    public static DAOQuran getInstance(Context context) {
        if (instance == null) {
            instance = new DAOQuran(context);
        }
        return instance;
    }

    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    public void close() {
        if (database != null) {
            this.database.close();
        }
    }






    public List<String>  getDataQuranByAyat(int surat,int ayat) {

        String SQLTestQuran = "SELECT `table_ayat`.`sura`, `table_ayat`.`aya`, `table_ayat`.`text` , " +
                "`table_arti_ayat`.`COL 2`, `table_arti_ayat`.`COL 3`, `table_arti_ayat`.`COL 4`\n" +
                "FROM `table_ayat` INNER JOIN `table_arti_ayat` on `table_ayat`.`sura` = `table_arti_ayat`.`COL 2` " +
                "AND `table_ayat`.`aya` = `table_arti_ayat`.`COL 3`" +
                "WHERE `table_ayat`.`sura` =" + surat  + " and `table_ayat`.`aya` =" + ayat;


        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(SQLTestQuran, null);

        List<String> list = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String ayatString = cursor.getString(2);
            String artiAyatString = cursor.getString(5);
            list.add(ayatString);
            list.add(artiAyatString);

            cursor.moveToNext();
        }

        cursor.close();

        return list;
    }

    public EntityQuran  getDataQuranBySurat(int surat) {

        String SQLTestQuran = "SELECT `table_ayat`.`sura`, `table_ayat`.`aya`, `table_ayat`.`text` , " +
                "`table_arti_ayat`.`COL 2`, `table_arti_ayat`.`COL 3`, `table_arti_ayat`.`COL 4`\n" +
                "FROM `table_ayat` INNER JOIN `table_arti_ayat` on `table_ayat`.`sura` = `table_arti_ayat`.`COL 2` " +
                "AND `table_ayat`.`aya` = `table_arti_ayat`.`COL 3`" +
                "WHERE `table_ayat`.`sura` =" + surat + ";";


        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(SQLTestQuran, null);

        List<String> listAyatMentah = new ArrayList<>();
        List<String> listArtiMentah = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String ayatString = cursor.getString(2);
            String artiAyatString = cursor.getString(5);
            listAyatMentah.add(ayatString);
            listArtiMentah.add(artiAyatString);

            cursor.moveToNext();
        }

        cursor.close();

        entity = new EntityQuran();
        entity.setListAyat(listAyatMentah);
        entity.setListArti(listArtiMentah);

        return entity;
    }


    public EntityQuran  getDataQuranByAyatTest(List suratGetList, List ayatgetList) {
        List<String> listAyatMentah = new ArrayList<>();
        List<String> listArtiMentah = new ArrayList<>();
        entity = new EntityQuran();
        for (int i = 0; i < ayatgetList.size(); i++) {

            String SQLTestQuran = "SELECT `table_ayat`.`sura`, `table_ayat`.`aya`, `table_ayat`.`text` , " +
                    "`table_arti_ayat`.`COL 2`, `table_arti_ayat`.`COL 3`, `table_arti_ayat`.`COL 4`\n" +
                    "FROM `table_ayat` INNER JOIN `table_arti_ayat` on `table_ayat`.`sura` = `table_arti_ayat`.`COL 2` " +
                    "AND `table_ayat`.`aya` = `table_arti_ayat`.`COL 3`" +
                    "WHERE `table_ayat`.`sura` = " +  ayatgetList.get(i) + " and `table_ayat`.`aya` =" + suratGetList.get(i);


            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(SQLTestQuran, null);


            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                String ayatString = cursor.getString(2);
                String artiAyatString = cursor.getString(5);
                listAyatMentah.add(ayatString);
                listArtiMentah.add(artiAyatString);

                cursor.moveToNext();
            }

            cursor.close();

            entity.setListAyat(listAyatMentah);
            entity.setListArti(listArtiMentah);


        }
        return entity;
    }



}

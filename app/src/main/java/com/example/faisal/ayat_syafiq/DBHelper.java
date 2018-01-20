package com.example.faisal.ayat_syafiq;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by faisal on 1/19/18.
 */

public class DBHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "ayat.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}

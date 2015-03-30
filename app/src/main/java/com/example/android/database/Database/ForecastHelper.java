package com.example.android.database.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JOHN KAGGA on 3/30/2015.
 */
public class ForecastHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "temperatures.db";
    private static final int DB_VERSION = 1;

    public ForecastHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    //Creating the Database and Adding columns
    private static final String DB_CREATE = "CREATE TABLE" + ForecastContract.ForecastEntry.TABLE_TEMPERATURE +
            " (" + ForecastContract.ForecastEntry.COLUMN_ID + "INTEGER PRIMARY KEY" + ForecastContract.ForecastEntry.COLUMN_TEMPERATURE +
            "REAL)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        //This code executes the Database
        db.execSQL(DB_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

package com.example.android.database.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by DELL on 3/30/2015.
 */
public class ForecastDataSource {

    //Reference to this class
    private ForecastHelper mForecastHelper;
    //Reference to the Database
    private SQLiteDatabase mDatabase;
    private Context mContext;

    public ForecastDataSource (Context context){
        mContext = context;
       mForecastHelper = new ForecastHelper(mContext);

    }
    //Opening the Database
    public void open() throws SQLException {
        mDatabase =mForecastHelper.getWritableDatabase();
    }
    //Closing the Database
    public void close(){
        mDatabase.close();
    }
}

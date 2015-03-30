package com.example.android.database.Database;

import android.provider.BaseColumns;

/**
 * Created by DELL on 3/30/2015.
 */
public class ForecastContract {

    public static final class ForecastEntry implements BaseColumns {
        //Adding the different Table name and different Columns
        public static final String TABLE_TEMPERATURE ="TEMPERATURES";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_TEMPERATURE ="TEMPERATURE";



    }
}

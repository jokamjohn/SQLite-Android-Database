package com.example.android.database.Ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.database.Database.ForecastDataSource;
import com.example.android.database.R;

import java.sql.SQLException;


public class MainActivity extends ActionBarActivity {

    //Reference the ForecastDataSource
    ForecastDataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiating mDataSource or Declaring mDataSource
        mDataSource = new ForecastDataSource(MainActivity.this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        //Database should be open only when the activity is active
        super.onResume();

        try {
            mDataSource.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void onPause() {
        //Database should be closed when the app is not active
        super.onPause();
        mDataSource.close();
    }


}

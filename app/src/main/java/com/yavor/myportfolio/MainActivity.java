package com.yavor.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void footballClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Football Scores app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void libraryClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void buildItClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void readerClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void capstoneClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
        toast.show();
    }
}

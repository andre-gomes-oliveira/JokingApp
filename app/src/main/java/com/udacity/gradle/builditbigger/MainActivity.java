package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.udacity.gradle.builditbigger.utils.EndpointsAsyncTask;

import br.com.udacity.jokegenerator.Joker;
import br.com.udacity.jokeviewer.jokeActivity;


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

    public void tellJoke(View view) {
/*
        Context context = this;
        Class destinationClass = jokeActivity.class;
        Intent intentToStartJokeActivity = new Intent(context, destinationClass);

        intentToStartJokeActivity.putExtra(getString(R.string.bundle_joke), Joker.getJoke());
        startActivity(intentToStartJokeActivity);
        */
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, Joker.getJoke()));
    }
}

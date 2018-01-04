package br.com.udacity.jokeviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class jokeActivity extends AppCompatActivity {

    private String mJoke;

    private Toolbar mToolbar;


    private TextView mJokeTextView;

    private TextView mErrorMessageTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mToolbar = findViewById(R.id.toolbar);
        mJokeTextView = findViewById(R.id.tv_joke_display);
        mErrorMessageTextView = findViewById(R.id.tv_error_message_display);

        setSupportActionBar(mToolbar);

        if (savedInstanceState != null) {
            mJoke = savedInstanceState.getString(getString(R.string.bundle_joke));
        } else {
            Intent starterIntent = getIntent();
            if (starterIntent != null) {
                mJoke = starterIntent.getStringExtra(getString(R.string.bundle_joke));
            }
        }

        if (mJoke != null && !mJoke.isEmpty()) {
            mJokeTextView.setText(mJoke);
            mJokeTextView.setVisibility(View.VISIBLE);
            mErrorMessageTextView.setVisibility(View.GONE);
        } else {
            mJokeTextView.setVisibility(View.GONE);
            mErrorMessageTextView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(getString(R.string.bundle_joke), mJoke);
    }
}

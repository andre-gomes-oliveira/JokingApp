package br.com.udacity.jokeviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class jokeActivity extends AppCompatActivity {

    private String mJoke;

    private Toolbar mToolbar;

    private FloatingActionButton mNewJokeButton;

    private TextView mJokeTextView;

    private TextView mErrorMessageTextView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mToolbar = findViewById(R.id.toolbar);
        mNewJokeButton = findViewById(R.id.fab);
        mJokeTextView = findViewById(R.id.tv_joke_display);
        mErrorMessageTextView = findViewById(R.id.tv_error_message_display);

        setSupportActionBar(mToolbar);

        mNewJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

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
}

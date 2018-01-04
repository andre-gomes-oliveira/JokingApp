package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class BasicActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void jokeButtonClicked_getJoke() {
        onView(withId(R.id.get_joke_button)).perform(click());
        onView(withId(R.id.tv_joke_display)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_joke_display)).check(matches(textViewHasValue()));
    }

    /**
     * *Custom matcher used to check if the text of a view is empty
     */

    private Matcher<View> textViewHasValue() {

        return new TypeSafeMatcher<View>() {

            @Override
            public void describeTo(Description description) {
                description.appendText("A valid joke is being displayed");
            }

            @Override
            public boolean matchesSafely(View view) {
                if (view != null) {
                    if (!(view instanceof TextView)) {
                        return false;
                    }

                    String text = ((TextView) view).getText().toString();
                    return (!TextUtils.isEmpty(text));
                }
                return false;
            }
        };
    }
}
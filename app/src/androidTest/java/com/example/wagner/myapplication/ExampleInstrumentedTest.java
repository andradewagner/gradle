package com.example.wagner.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import static android.support.test.espresso.Espresso.onView;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    private String stringDigitar;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void initValidString() {
        stringDigitar = "Wagner Andrade";
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.wagner.myapplication", appContext.getPackageName());

        onView(ViewMatchers.withId(R.id.editText)).perform(ViewActions.typeText(stringDigitar));
        Espresso.closeSoftKeyboard();
        onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());
    }
}

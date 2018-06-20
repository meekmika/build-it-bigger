package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class NonNullNorEmptyResponseTest {

    @Test
    public void testJokeResponse() {
        String response = null;
        MainActivity.EndpointsAsyncTask task = new MainActivity.EndpointsAsyncTask();
        task.execute(InstrumentationRegistry.getTargetContext());

        try {
            response = task.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertThat(response, not(isEmptyOrNullString()));
    }
}

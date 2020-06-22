package zm.hashcode.appctivities;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class SecondActivityTest {
    @Rule

    public ActivityTestRule<SecondActivity> activityRule =
            new ActivityTestRule(SecondActivity.class);



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listGoesOverTheFold() {
        onView(withText("Hello world!"))
                .check(matches(isDisplayed()));
    }


}
package zm.hashcode.appctivities;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class FourthActivityTest {




    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testChangeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.fourth_textView))
                .perform(typeText("Hello"), closeSoftKeyboard());
        onView(withId(R.id.fourth_button))
                .perform(click());

        // Check that the text was changed.
        // Check that the text was changed.
        onView(withId(R.id.fourth_textView))
                .check(matches(withText("Hello")));

    }

}
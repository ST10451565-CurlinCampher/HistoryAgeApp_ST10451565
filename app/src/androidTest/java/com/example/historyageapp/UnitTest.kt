package com.example.historyageapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UnitTest {

    @Before
    fun setUp() {
        // Start the MainActivity before each test
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun calculateButtonClicked_showResult() {
        // Input age into the EditText field
        onView(withId(R.id.edtAge))
            .perform(typeText("30"), closeSoftKeyboard())

        // Click the Calculate button
        onView(withId(R.id.btnResults))
            .perform(click())

        // Check if the result TextView displays the expected text
        onView(withId(R.id.txtResult))
            .check(matches(withText("Your 30: Martin Luther King Jr. was a historical figure what at the age died 39")))
    }

    @Test
    fun clearButtonClicked_clearFields() {
        // Input age into the EditText field
        onView(withId(R.id.edtAge))
            .perform(typeText("30"), closeSoftKeyboard())

        // Click the Clear button
        onView(withId(R.id.btnClear))
            .perform(click())

        // Check if the EditText field is empty
        onView(withId(R.id.edtAge))
            .check(matches(withText("")))

        // Check if the result TextView is empty
        onView(withId(R.id.txtResult))
            .check(matches(withText("")))
    }
}

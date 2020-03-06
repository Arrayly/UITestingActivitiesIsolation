package com.example.uitestingactivitiesisolation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.Visibility.VISIBLE
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.*

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get : Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_isTextViewDisplayed() {
        onView(withId(R.id.MainActivity_tv)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isButtonDisplayed() {
        onView(withId(R.id.MainActivity_btn)).check(matches(withEffectiveVisibility(VISIBLE)))
    }

    @Test
    fun test_isTextInButtonDisplayed() {
        onView(withId(R.id.MainActivity_btn)).check(matches(withText(R.string.navigate)))
    }
}
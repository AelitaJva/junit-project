package com.automation.test;

import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest {

    @Test
    @Category(SmokeTest.class)
    public void verifySearchResultAreDisplayed () {
        System.out.println("Verify search result");
    }

    @Test
    public void verifyMessageWhenThereAreNoResult () {
        System.out.println("Verify no result message");
    }

    @Test
    public void verifySearchResultHasSearchKeyword () {
        System.out.println("Verify search result has search keyword");
    }
}

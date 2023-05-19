package com.automation.test;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setUp() {
        System.out.println("Browser opening");
    }

    @After
    public void cleanUp () {
        System.out.println("Browser closing");
    }
}

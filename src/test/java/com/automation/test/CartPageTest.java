package com.automation.test;

import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartPageTest extends BaseTest {
    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanAddProductToCart () {
        System.out.println("Verify user can add item");
    }

    @Test
    public void verifyUserCanRemoveItemFromCArt () {
        System.out.println("Verify user can remove item");
    }

    @Test
    public void verifyUserCanChangeQuantityOfItem () {
        System.out.println("Verify user can change quantity of item");
    }
}

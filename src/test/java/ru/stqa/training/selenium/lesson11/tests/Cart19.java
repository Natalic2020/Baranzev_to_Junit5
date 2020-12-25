package ru.stqa.training.selenium.lesson11.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Cart19 extends TestBase {

    @Test
    public  void checkCartTest() throws InterruptedException {
        int firstInCart = app.getCountProductsInCart();
        app.addProductsToCart(3);
        assertTrue( firstInCart + 3 == app.getCountProductsInCart(), "Add no 3 Products ");
        app.removeAllProductsFromCart();
        assertTrue( 0 == app.getCountProductsInCart(), "Did not remove all Products ");
    }
}

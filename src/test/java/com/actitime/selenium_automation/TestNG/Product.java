package com.actitime.selenium_automation.TestNG;

import org.testng.annotations.Test;

public class Product {

    @Test(priority = -1)
    public void login() {
        System.out.println("Login is Successful");
    }

    @Test(priority = -2)
    public void searchProduct() {
        System.out.println("search Product");
    }

    @Test(priority = 3)
    public void selectProduct() {
        System.out.println("Product is selected");
    }

    @Test(priority = -4)
    public void addToCart() {
        System.out.println("Product is addet to cart");
    }

    @Test(priority = 5)
    public void payment() {
        System.out.println("pay the payment");
    }

}

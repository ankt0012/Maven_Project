package com.actitime.selenium_automation.TestNG;

import org.testng.annotations.Test;

public class DependsOn {

    @Test()
    public void login() {
        System.out.println("login is Successful");

    }

    @Test(dependsOnMethods = { "logiin", "login" })
    public void addToCart() {
        System.out.println("Product is added to cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void payment() {
        System.out.println("pay the payment");
    }
}

package com.actitime.selenium_automation.TestNG;

import org.testng.annotations.Test;

public class Enabled {

    @Test
    public void a() {
        System.out.println("From method a");
    }

    @Test(enabled = false)
    public void d() {
        System.out.println("From method d ");

    }

    @Test(invocationCount = 0)
    public void b() {
        System.out.println("From method b");

    }

    @Test
    public void e() {
        System.out.println("form method e");
    }
}

package com.actitime.selenium_automation.TestNG;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 2)
    public void demo() {
        System.out.println("Demo");
    }

}

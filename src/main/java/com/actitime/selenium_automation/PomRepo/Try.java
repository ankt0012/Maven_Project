package com.actitime.selenium_automation.PomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Desktop/Selenium_Class_11-30/Selenium1/drivers/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

        

    }
    
}

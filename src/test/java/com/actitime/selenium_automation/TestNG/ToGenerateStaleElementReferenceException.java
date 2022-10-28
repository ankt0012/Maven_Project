package com.actitime.selenium_automation.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToGenerateStaleElementReferenceException {


    @Test
    public void demo(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file://demo-actitime.com/login.do");

        WebElement ele = driver.findElement(By.id("username"));
        ele.sendKeys("admin");
        System.out.println(ele);

        driver.navigate().refresh();
        
        ele.sendKeys("manager");
        WebElement element = driver.findElement(By.id("username"));
        System.out.println(element);
        element.sendKeys("manager");
    }
    
}

package com.actitime.selenium_automation.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.selenium_automation.PomRepo.CreateNewCustomerPage;
import com.actitime.selenium_automation.PomRepo.CustomerDetailsPage;
import com.actitime.selenium_automation.PomRepo.HomePage;
import com.actitime.selenium_automation.PomRepo.LoginPage;
import com.actitime.selenium_automation.PomRepo.TaskPage;




public class CreateCustomer {

    @Test
    public void createCustomerAndVerifyCustomerName() throws InterruptedException{
        String expectedHomePageTitle = "actiTIME - Enter Time-Track";

        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Desktop/Selenium/Git_Selenium/drivers/chromedriver.exe");
        WebDriver driver ;
        driver= new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");

        LoginPage login = new LoginPage(driver);
        login.loginAction("admin", "manager");

        WebDriverWait wait = new WebDriverWait(driver, 20 );
        wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));

        String actualHomePageTitle = driver.getTitle();


        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
        System.out.println("pass: Home Page has been verified");
        
        HomePage home = new HomePage(driver);
        home.clickOnTaskButton();

        TaskPage task = new TaskPage(driver);
        task.clickOnNewCustomerButton();

        String expectedCustomerName = "Ankit001234";

        CreateNewCustomerPage newCustomer = new CreateNewCustomerPage(driver);
        newCustomer.createNewCustomer(expectedCustomerName, "Delhi");

        CustomerDetailsPage customerDetails = new CustomerDetailsPage(driver);
        String actualCustomerName= customerDetails.verifyCustomerName(expectedCustomerName);

        Assert.assertEquals(actualCustomerName, expectedCustomerName);
        System.out.println("Pass: The Customer Name has been verified.");

        home.clickOnLogoutButton();
        Thread.sleep(5000);
        driver.quit();
    }
    
}

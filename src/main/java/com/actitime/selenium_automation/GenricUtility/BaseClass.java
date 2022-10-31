package com.actitime.selenium_automation.GenricUtility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
    
    @BeforeSuite
    public void  bsConfig(){
        System.out.println("DataBase Connect has been extablised.");
    } 

    @BeforeClass
    public void bcConfig(){
        System.out.println("The browser Connect has been launched");
        System.out.println("Naviagte to the url");
    }

    @BeforeMethod
    public void bmConfig(){
        System.out.println("Logged in to the application");
    }

    @AfterMethod
    public void amConfig(){
        System.out.println("Logged in to the application");
    }

    @AfterClass
    public void acConfig(){
        System.out.println("Browser has been closed");
    }

    @AfterSuite
    public void asConfig(){
        System.out.println("End Database connections");
    }
}

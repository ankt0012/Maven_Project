package com.actitime.selenium_automation.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Add New']")
    private WebElement addNewButton;

    @FindBy(xpath = "//div[text()='+ New Customer']")
    private WebElement newCustomerButton;

    public WebElement getAddNewButton() {
        return addNewButton;
    }

    public WebElement getNewCustomerButton() {
        return newCustomerButton;
    }

    public void clickOnNewCustomerButton(){
        addNewButton.click();
        newCustomerButton.click();
    }
    
}

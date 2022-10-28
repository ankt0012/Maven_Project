package com.actitime.selenium_automation.PomRepo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;

public class CustomerDetailsPage {
    WebDriver driver;
    public CustomerDetailsPage(WebDriver driver){
        // PageFactory.initElements(driver, this);
        this.driver= driver;
    }

    // @FindBy(xpath = "//div[@title='Ankit001223']")
    // private WebElement actualCustomerName;

    // public WebElement getActualCustomerName() {
    //     return actualCustomerName;
    // } 
   
    // public String verifyCustomerName(){
    //     return actualCustomerName.getText();
    // }
        
    public String verifyCustomerName(String customer){
        return driver.findElement(By.xpath("(//div[text()='"+customer+"'])[2]")).getText();

    }
  
}

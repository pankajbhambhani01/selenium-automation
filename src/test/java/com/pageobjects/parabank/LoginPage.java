package com.pageobjects.parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {

    private WebDriver driver;

    //pojo -> page object model (pom)
    @FindBy(name = "username" )
    private WebElement eleUsername;

    @FindBy(name = "password")
    private WebElement elePassword;

    @FindBy(partialLinkText = "Forgot login in")
    private WebElement eleForgotLoginInfo;

    @FindBy(tagName = "h2")
    WebElement eleFormTitle;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getTitle(){
        return eleFormTitle.getText();
    }

    public void enterUsername(String username){
        eleUsername.sendKeys(username);
        Reporter.log("The username is entered sucessfully " + username);
    }

    public void enterPassword(String passowrd){
        elePassword.sendKeys(passowrd);
        Reporter.log("The password is entered sucessfully " + passowrd);
    }

    public void clickForgetInfoLink(){
         eleForgotLoginInfo.click();
        Reporter.log("The forgot login link is clicked");
    }

}

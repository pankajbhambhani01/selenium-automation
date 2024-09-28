package com.testcases.testng;

import com.pageobjects.parabank.RegisterForm;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.Browser;
import util.FileReading;
import util.Wait;

import java.util.Properties;

public class parabankTc2 {
        Browser br;
        RegisterForm registerForm;
        Wait w;

    @BeforeMethod
    public void beforeMethod(){
        br = new Browser();
        Properties p = FileReading.readFile("config.properties");
        br.lounchBrowser(p.getProperty("browser"));
        br.maximize();
        br.navigateUrl(p.getProperty("url"));
        registerForm =new RegisterForm(br.getDriver());
    }
    @Test(testName = "register Link works")
    public void testcase(){
        w=new Wait();
        registerForm.enterRegisterLink();
        registerForm.enterFirstname("Asmita");
        registerForm.enterLastname("Patil");
        registerForm.enterAddress("ram nagar");
        registerForm.enterCity("dhule");
        registerForm.enterState("Maharashtra");
        registerForm.enterZipcode("123");
        registerForm.enterPhone("9574857623");
        registerForm.enterssn(">>>");
        Properties p=FileReading.readFile("login.properties");
        registerForm.enterUsername(p.getProperty("username"));
        registerForm.enterPassword(p.getProperty("password"));
        registerForm.enterConfirmPassword(p.getProperty("password"));
        w.wait(5);
        registerForm.clickRegisterButton();
    }
    @AfterMethod
    public void afterMethod(){
        br.closeBrowser();
    }
}

package com.testcases;

import com.pageobjects.parabank.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.Browser;
import util.FileReading;

import java.util.Properties;

public class ForgetLoginInfoTC {
    Browser br;
    LoginPage loginPage;

    @BeforeMethod
    public void beforeMethod(){
        Properties p = FileReading.readFile("config.properties");
        br = new Browser();
        br.launchBrowser(p.getProperty("browser"));
        br.maximize();
        br.navigateUrl(p.getProperty("url"));
        loginPage = new LoginPage(br.getDriver());
    }

    @Test(testName = "click on forgot login info")
    public void testcase1(){
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, "Customer Login");
        loginPage.clickForgetInfoLink();
    }

    @Test(testName = "check login works")
    public void testcase2(){
        Properties p = FileReading.readFile("login.properties");
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, p.getProperty("title"));
        loginPage.enterUsername(p.getProperty("username"));
        loginPage.enterPassword(p.getProperty("password"));
    }

    @AfterMethod
    public void afterMethod(){
        br.closeBrowser();
    }

}

// TestNg xml -

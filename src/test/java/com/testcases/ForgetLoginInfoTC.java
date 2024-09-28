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

    @Test(groups = {"functional"}, testName = "click on forgot login info")
    public void testcase1(){
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, "Customer Login");
        loginPage.clickForgetInfoLink();
    }

    @Test(groups = {"functional", "sanity"}, testName = "check login works")
    public void testcase2(){
        Properties p = FileReading.readFile("login.properties");
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, p.getProperty("title"));
        loginPage.enterUsername(p.getProperty("username"));
        loginPage.enterPassword(p.getProperty("password"));
    }

    @Test(groups = {"functional", "regression"}, testName = "check login works")
    public void testcase3(){
        Properties p = FileReading.readFile("login.properties");
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, p.getProperty("title"));
        loginPage.enterUsername(p.getProperty("username"));
        loginPage.enterPassword(p.getProperty("password"));
    }

    @Test(groups = {"regression"}, testName = "check login works")
    public void testcase4(){
        Properties p = FileReading.readFile("login.properties");
        String formTitle = loginPage.getTitle();
        Assert.assertEquals(formTitle, p.getProperty("title"));
        loginPage.enterUsername(p.getProperty("username"));
        loginPage.enterPassword(p.getProperty("password"));
    }

    @Test(dependsOnMethods = "testcase4", groups = {"regression"})
    public void testcase00(){
        System.out.println("In to test case 5");
    }

    @AfterMethod
    public void afterMethod(){
        br.closeBrowser();
    }

}

//CI/CD - Continious integreration / continious development - pipelines - jenkins
// depends on method -> first the required method will run then the dependendt method will run if the primary method fails then the dependent method will not execute
// depends on group -> it will always run post that group
// TestNg xml -

package com.testcases;

import com.pageobjects.parabank.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;
import util.Browser;

public class BeforeAfter {

    @BeforeClass
    public void beforeClass(){
        System.out.println("In before class");
    }
    @BeforeMethod
    public void beforeMethod(){
       System.out.println("In before Method");
    }

    @Test
    public void testcase1(){
        System.out.println("In Test case1");
    }

    @Test
    public void testcase2(){
        System.out.println("In Test case2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("In After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("In After class");
    }

}

// TestNg xml -
//@BeforeTest -> @BeforeTest -> @BeforeClass -> @BeforeMethod -> @AfterMethod....
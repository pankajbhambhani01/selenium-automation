package com.mylistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("--- Test case Started --- ");
        System.out.println("--- " + iTestResult.getName() + " ----");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("--- " + iTestResult.getName() + " is passed ----");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("--- " + iTestResult.getName() + " is failed ----");
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}

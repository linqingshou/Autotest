package com.lqs.reportdemo.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuit....");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite....");
    }
}

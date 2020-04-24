package com.lqs.reportdemo.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters("str")
    public void paramterTest1(String str){
        System.out.println("this paramter: " + str);
    }
}

package com.lqs.reportdemo.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void test01(){
        System.out.println("test01执行成功");
    }
    @Test(enabled = false)
    public void test02(){
        System.out.println("跳过执行test02");
    }
    @Test(enabled = true)
    public void test03(){
        System.out.println("test03执行了");
    }
}

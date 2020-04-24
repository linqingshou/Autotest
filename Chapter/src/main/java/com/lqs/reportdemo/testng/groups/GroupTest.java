package com.lqs.reportdemo.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = "lqs")
    public void test01(){
        System.out.println("lqs运行组1");
    }
    @Test(groups = "lqs")
    public void test02(){
        System.out.println("lqs运行组2");
    }

    @Test(groups = "lll")
    public void test03(){

        System.out.println("非lqs组");
    }

    @BeforeGroups("lqs")
    public void beforGroup(){
        System.out.println("lqs组运行之前的方法");
    }
    @AfterGroups("lqs")
    public void afterGroup(){
        System.out.println("lqs组运行之后的方法");
    }



}

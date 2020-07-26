package com.course.testing.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//套件配置
public class SuitConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit 运行啦");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suit 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }


}

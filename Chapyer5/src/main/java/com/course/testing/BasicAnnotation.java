package com.course.testing;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.print("testcase1");
    }

    @Test
    public void testCase2(){
        System.out.print("testcase2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.print("before test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.print("after test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.print("befter Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.print("after Class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.print("afterSuite");
    }

}

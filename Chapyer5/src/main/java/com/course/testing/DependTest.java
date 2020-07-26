package com.course.testing;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.print("test1, run");
        //throw new RuntimeException();
    }

    //如果test1执行失败，则test2不再执行
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("test2, run");
    }
}

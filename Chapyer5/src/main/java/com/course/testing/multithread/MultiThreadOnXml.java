package com.course.testing.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.println("1"+" thread id: "+Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("2"+" thread id: "+Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("3"+" thread id: "+Thread.currentThread().getId());
    }

}

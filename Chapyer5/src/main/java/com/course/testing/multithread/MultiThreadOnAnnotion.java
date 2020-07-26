package com.course.testing.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.print("1"+" thread id: "+Thread.currentThread().getId());
    }

}

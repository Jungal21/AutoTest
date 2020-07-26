package com.course.testing;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 excute");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 excute");
    }
}

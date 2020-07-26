package com.course.testing;

import org.testng.annotations.Test;

public class ExceptedException {
   /*
   异常测试：当预期结果为为异常时
    */
/*
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.print("runTimeException");
    }*/

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){
        System.out.print("runTimeException test");
        throw new RuntimeException();
    }
}

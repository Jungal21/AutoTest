package com.course.testing.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PatameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name, int age){
        System.out.println("name="+name+" age="+age);
    }
}

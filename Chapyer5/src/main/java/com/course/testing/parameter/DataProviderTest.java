package com.course.testing.parameter;

import com.sun.tools.corba.se.idl.constExpr.GreaterThan;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.print("name=" + name + " age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return o;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.print("test1--" + "name=" + name + " age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.print("test2--" + "name=" + name + " age=" + age);
    }


    @DataProvider(name = "methodData")
    public Object[][] methoddataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan1", 10},
                    {"lisi1", 20},
                    {"wangwu1", 30}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"zhangsan2", 10},
                    {"lisi2", 20},
                    {"wangwu2", 30}
            };
        }
        return result;
    }
}
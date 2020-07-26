package com.course.testing.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("server-group test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server-group test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client-group test3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("client-group test4");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("before client-test");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("after client-test");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("before server-test");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("after server-test");
    }

}

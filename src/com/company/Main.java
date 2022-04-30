package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
    @Test
    void printInfo(){
        System.out.println("Hello fromprint info");
    }

    @Test
    void printSecond(){
        System.out.println("Hello from second info");
        //Assert.fail("This is fail");
        Assert.fail("This is fail");
    }

    @Test
    void printThird(){
        System.out.println("Hello from third info");
    }
}

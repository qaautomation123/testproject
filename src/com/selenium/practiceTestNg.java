package com.selenium;

import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.*;

public class practiceTestNg {

    @AfterTest
    public void closeBroser(){
        System.out.println("This will close the browser");
    }

    @Test (priority = 1)
    public void FstTestCase(){
        Assert.assertFalse(1>2);
        System.out.println("This is our First Test Case");
    }

    @Test (priority = 3)
    public void ThirTC(){
        String s = "350";
        int i = Integer.parseInt(s);
        int l = i+50;
        System.out.println(l);
        System.out.println("This is our Third Test Case");
    }

    @Test (priority = 4, enabled = false)
    public void FourthTC(){
        System.out.println("This is our Fourth Test Case");
    }

    @BeforeTest
    public void browseOpen(){
        System.out.println("This method will open the browser");
    }

    @Test (priority = 2, enabled = false)
    public void SeTestCase(){
        System.out.println("This is our second test case");
    }


}

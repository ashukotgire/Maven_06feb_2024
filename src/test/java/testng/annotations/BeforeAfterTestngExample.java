package testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestngExample
{
    @BeforeTest
    public void beforeTestDemo()
    {
        System.out.println("before test demo for beforeClass example class ");
    }

    @AfterTest
    public void afterTestDemo()
    {
        System.out.println("after test demo beforeClass example class ");
    }

    @Test
    public void verifyTestCase_1()
    {
        System.out.println("verify test case 1");
    }

    @Test
    public void verifyTestCase_2()
    {
        System.out.println("verify test case 2");
    }




}


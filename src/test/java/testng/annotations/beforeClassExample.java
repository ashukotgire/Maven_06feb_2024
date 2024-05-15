package testng.annotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class beforeClassExample
{
    public WebDriver driver;

    @BeforeTest
    public void beforeTestDemo()
    {
        System.out.println("before test demo ");
    }

    @AfterTest
    public void afterTestDemo()
    {
        System.out.println(" after test demo ");
    }

    @BeforeClass
    public void brforeclass()
    {
        System.out.println("before class example");
    }


    @BeforeMethod
    public void beforeMethodDemo()
    {
        System.out.println("before method example");

    }

    @Test
    public void testcase1()
    {
        System.out.println("test case 1 example");
    }

    @Test
    public void testcase2()
    {
        System.out.println("test case 2 example");
    }

    @AfterMethod

    public void afterMethodDemo()
    {
        System.out.println("after method example");
    }










}

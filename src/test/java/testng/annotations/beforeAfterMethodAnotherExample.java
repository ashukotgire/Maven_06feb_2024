package testng.annotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAfterMethodAnotherExample
{
    public WebDriver driver;

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

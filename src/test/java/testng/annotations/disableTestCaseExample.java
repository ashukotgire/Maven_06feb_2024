package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class disableTestCaseExample
{

    @Test(enabled = false)
    public void verifyNewHomeLogin()
    {
        System.out.println("new home page login");
    }

    @Test
    public void verifyLMS()
    {
        System.out.println("verify loan management system");

    }

}

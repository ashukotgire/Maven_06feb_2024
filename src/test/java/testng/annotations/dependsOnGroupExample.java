package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroupExample
{
    @Test(groups = {"smoke"})
    public void verifyNewHomeLogin()
    {
        Assert.assertTrue(false);
        System.out.println("new home page login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyLMS()
    {
        System.out.println("verify loan management system");

    }

    @Test
    public void verifyCardManagement()
    {
        System.out.println("verify card management system");
    }



}

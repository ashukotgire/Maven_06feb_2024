package testng.annotations;

import failtestscriptexecution.RetryFailScript;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testngPriority
{
    @Test(priority = 1 )
    public void priorityDemo_Z()
    {
        System.out.println("priorityDemo_Z");
    }

    @Test(priority = 2 )
    public void priorityDemo_F()
    {
        System.out.println("priorityDemo_F");
    }

    @Test(priority = 3 )
    public void priorityDemo_N()
    {
        System.out.println("priorityDemo_N");
    }

    @Test(priority = 4 )
    public void priorityDemo_I()
    {
        System.out.println("priorityDemo_A");
    }

    @Test(priority = 5 )
    public void priorityDemo_H()
    {
        Assert.assertTrue(false);
        System.out.println("priorityDemo_H");
    }

    @Test(priority = 6 )
    public void priorityDemo_A()
    {
        System.out.println("priorityDemo_A");
    }

    @Test(priority = 7 , groups = "smoke")
    public void priorityDemo_Y()
    {
       Assert.assertTrue(false);
        System.out.println("priorityDemo_Y");
    }

}

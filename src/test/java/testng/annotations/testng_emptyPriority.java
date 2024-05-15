package testng.annotations;

import org.testng.annotations.Test;

public class testng_emptyPriority
{
    @Test(priority = 1)
    public void priorityDemo_Z()
    {
        System.out.println("priorityDemo_Z");
    }

    @Test
    public void priorityDemo_F()
    {
        System.out.println("priorityDemo_F");
    }

    @Test(priority = 3)
    public void priorityDemo_N()
    {
        System.out.println("priorityDemo_N");
    }

}

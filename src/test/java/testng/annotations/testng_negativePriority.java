package testng.annotations;

import org.testng.annotations.Test;

public class testng_negativePriority
{


    @Test(priority = -1)
    public void priorityDemo_Z()
    {
        System.out.println("priorityDemo_Z");
    }

    @Test(priority = 2)
    public void priorityDemo_F()
    {
        System.out.println("priorityDemo_F");
    }

    @Test(priority = 3)
    public void priorityDemo_N()
    {
        System.out.println("priorityDemo_N");
    }

    @Test(priority = 4)
    public void priorityDemo_I()
    {
        System.out.println("priorityDemo_A");
    }

    @Test(priority = -5)
    public void priorityDemo_H()
    {
        System.out.println("priorityDemo_H");
    }

}

package testng.annotations;

import org.testng.annotations.Test;

public class testng_twoEmptyPriority
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

    @Test
    public void priorityDemo_N()
    {
        System.out.println("priorityDemo_N");
    }

    @Test(priority = 4)
    public void priorityDemo_I()
    {
        System.out.println("priorityDemo_A");
    }





}

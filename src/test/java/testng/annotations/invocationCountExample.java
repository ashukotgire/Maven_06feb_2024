package testng.annotations;

import org.testng.annotations.Test;

public class invocationCountExample
{
    @Test(invocationCount = 50)
    public void invocationCountDemo()
    {

        System.out.println("invocation count demo ");
    }
}

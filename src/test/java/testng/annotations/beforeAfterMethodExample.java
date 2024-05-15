package testng.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAfterMethodExample
{
    public WebDriver driver;


    @BeforeMethod
    public void beforeMethodExample()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
    }

    @Test(groups = "smoke")
    public void annotationMethod1()
    {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void annotationMethod2()
    {
        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        
    }
    
    @AfterMethod
    public void afterMethodExample()
    {
      driver.close();
    }
}



package mavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNgExample
{
    @Test(groups = "smoke")
    public void basicOfTestNg1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void basicOfTestNg2()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        driver.close();
    }
    }



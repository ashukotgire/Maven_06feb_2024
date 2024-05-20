package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test(groups = "smoke")
    public void hardassert_1() {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement username = driver.findElement(By.id("login1"));
        Assert.assertTrue(username.isDisplayed(), "text box should be displayed");
        Assert.assertEquals(title, "Rediffmail", "should be match");
        System.out.println("hello everyone , good evening");
        //driver.close();
        driver.close();


    }
}

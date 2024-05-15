package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void softAssert_1() {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        SoftAssert softAssert = new SoftAssert();
        String title = driver.getTitle();
        WebElement username = driver.findElement(By.id("login1"));
        softAssert.assertTrue(username.isDisplayed(), "text box should be displayed");
        softAssert.assertEquals(title, "rediffmail", "should be match");
       softAssert.assertAll();
       driver.close();

    }
}

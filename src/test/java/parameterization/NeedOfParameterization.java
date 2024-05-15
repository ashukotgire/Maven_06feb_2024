package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization
{

    @Test
    public void parameter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       WebElement searchTextBox = driver.findElement(By.name("q"));
       searchTextBox.sendKeys("java"+" "+ "pune");
       searchTextBox.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       driver.close();
    }







}

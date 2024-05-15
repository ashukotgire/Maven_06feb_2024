package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider
{
    public static WebDriver driver;

    @DataProvider(name = "test data")
    public Object[][] dataProviderFunction(){
        return new Object[][]{
                {"Selenium" , "mumbai"},
                {"Selenium" , "pune"},
                {"Selenium" , "nashik"},
                {"Selenium" , "Hydrabad"}
        };
    }


    @Test(dataProvider = "test data")
    public void dataProvider(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys( courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
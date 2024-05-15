package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
    public static WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodAnnotation(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions option = new FirefoxOptions();
            option.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver(option);
            driver.get("https://www.google.com/");
            driver.close();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\Downloads\\edgedriver_win32\\msedgedriver.exe ");
            driver = new EdgeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            driver.close();

        } else {
            throw new RuntimeException("please select the correct browser");
        }
    }

    @Parameters({"CourseName" , "cityName" })
    @Test
    public void parameter(String CourseName , String cityName) throws InterruptedException {

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(CourseName + " "+ cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
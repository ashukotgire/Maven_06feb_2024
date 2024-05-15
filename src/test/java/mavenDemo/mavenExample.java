package mavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenExample {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
        driver.close();
    }
}
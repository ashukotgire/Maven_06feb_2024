package parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {


    @DataProvider(name = "test data")
    public Object[][] dataProviderWithExcel() throws IOException {

        Object[][] arrObj = getDataFromExcel("C:\\Users\\hp\\Desktop\\parametar.xlsx", "Sheet1");
        return arrObj;
    }

    public String[][] getDataFromExcel(String filepath, String sheetName) throws IOException {

        FileInputStream file = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfCol = row.getLastCellNum();

        Cell cell;
        String[][] data = new String[noOfRow-1][noOfCol];
        for (int i = 1; i < noOfRow; i++) {
            for (int j = 0; j < noOfCol; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "test data")
    public void dataProvider(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\new selinium path\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys( courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}


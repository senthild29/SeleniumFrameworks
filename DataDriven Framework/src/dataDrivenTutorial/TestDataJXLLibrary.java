package dataDrivenTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.CellValue;

public class TestDataJXLLibrary {

	WebDriver driver;

	@DataProvider(name = "getData")
	public String[][] UsingDataProvider() throws BiffException, IOException {
		String[][] data = ReadExcelData(); // Storing data returned by ReadExcelData() method in a 2 dimensional String
		return data; // Returning the stored 2 dimensional data to data provider "getData"
	}

	public String[][] ReadExcelData() throws BiffException, IOException { // Creating method to read data from Excel
		// sheet

		FileInputStream filelocation = new 
				FileInputStream("F:\\Senthil\\Testing\\Tutorials\\Test Data\\DataValo.xls"); // Creating new object to get the file location

		Workbook getBook = Workbook.getWorkbook(filelocation); // Getting workbook from above file location

		Sheet getSheet = getBook.getSheet(0); // Getting sheet from above workbook
		// we can also use sheet name"getSheet("Valo)" instead of index "getSheet(0)"

		int col = getSheet.getColumns(); // Getting number of columns from sheet
		int row = getSheet.getRows(); // Getting number of rows from sheet

		String[][] getValues = new String[row - 1][col]; // Created 2 dimensional array to Store the iterated data(rows
		// and cols) from for loop

		// Using for loop iterating the data and storing it in "getValues" variable 2
		// dimensional array
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				getValues[i - 1][j] = getSheet.getCell(j, i).getContents();
			}
		}
		return getValues;

	}

	@BeforeTest // Opening browser using @beforetest to reduce the execution time
	public void OpenBorwser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(dataProvider = "getData") // Get the test data from @data provider annotation
	public void LoginSite(String getUser, String getPass) {


		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement un = driver.findElement(By.id("txtUsername"));
		un.sendKeys(getUser);

		WebElement pwd = driver.findElement(By.id("txtPassword"));
		pwd.sendKeys(getPass);

		WebElement login = driver.findElement(By.id("btnLogin")); login.click();


	}

	@AfterTest // This will close the browser after @Test exeuction
	public void CloseBrowser() {
		driver.close();
	}

}

package dataDrivenTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDataApacheJava {

	//Created List<String> to store the values iterated using While loop in method ReadExcel()
	//Reason for adding static is, we are going to print this <String> values using main method public static void main(String[] args)
	static List<String> Username = new ArrayList<String>();
	static List<String> Password = new ArrayList<String>();

	//Created new method to read the data from excel using ApachePOI
	public void ReadExcel() throws IOException {
		
		FileInputStream fileloc = new FileInputStream("F:\\Senthil\\Testing\\Tutorials\\Test Data\\DataValo.xls");
		Workbook book = new HSSFWorkbook(fileloc);

		Sheet getSheet = book.getSheetAt(0);

		Iterator<Row>  rowIterate = getSheet.iterator();

		while(rowIterate.hasNext()) {
			Row rows = rowIterate.next();
			Iterator<Cell> colIterate =  rows.iterator();
			int i=2;
			while(colIterate.hasNext()) {
				if(i%2==0) {
					Username.add(colIterate.next().getStringCellValue());					
				}
				else {
					Password.add(colIterate.next().getStringCellValue());
				}
				i++; 

			}


		}

	} 

	//Created method LoginPage() and getting values from List <String> "Username" and "Password", using method executeTC()
	public void LoginPage(String getUSer, String getPass) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement un = driver.findElement(By.id("txtUsername"));
		un.sendKeys(getUSer);

		WebElement pwd = driver.findElement(By.id("txtPassword"));
		pwd.sendKeys(getPass);

		WebElement login = driver.findElement(By.id("btnLogin")); login.click();

		driver.close();

	}

	//Created new method executeTC() to execute the test case till List <String> Username and Password has values in it
	public void executeTC() {

		//Using for loop getting the size of List <String> "Username" and "Password" and iterating the same
		for(int i=0; i< Username.size(); i++) {			

			//Passing the values of List <String> "Username" and "Password" to method LoginPage()
			LoginPage(Username.get(i),Password.get(i));

		}
	}

	//In this scenarios we are not going to use TestNG annotations so we creating class with Main Method()
	public static void main(String[] args) throws IOException {


		// Creating new object with class name "TestDataApacheJava" to execute other methods()		
		TestDataApacheJava ReadData = new TestDataApacheJava();

		//Instructing object "ReadData" to execute method ReadExcel() and print the values
		ReadData.ReadExcel();
		System.out.println("User name : "+Username);
		System.out.println("Password  : "+Password);

		//Instructing object "ReadData" to execute method executeTC()
		ReadData.executeTC();

	}
}


package dataDrivenTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	String [][] getData = { //Storing user name and password in a  2 dimensional String array, in order to pass the data to dataprovider annotations
			{"Admin","admin123"},
			{"test","dummy"}
	};
	
	//Using DataProvider annotation passing multiple test data to test case. it will read the data from 2 dimensional array and send it to test case
@DataProvider(name = "getValues") //Creating data provider and assigning a name "getValues"
	public String[][] GetValuesUsingDataProvider() {//Changing data type to public String [][], instead of public void, since void will not return any value.
		return getData; //Using return type, getting the values from "getData" 2 dimensional array
	}

	@Test(dataProvider = "getValues")	//Connecting @Test to @DataProvider using dataprovider attribute
	public void CorrectCred(String getUN, String getPWD) {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement un = driver.findElement(By.id("txtUsername"));
		un.sendKeys(getUN);

		WebElement pwd = driver.findElement(By.id("txtPassword"));
		pwd.sendKeys(getPWD);

		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();

		driver.close();
	}

}

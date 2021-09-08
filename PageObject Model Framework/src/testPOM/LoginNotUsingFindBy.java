package testPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginNotUsingFindBy {
	
	//Creating variable using Static keyword and WebElement return type
	//Identifying webelement Using lement locator (By.Id or By.Name)
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void Login() throws InterruptedException {		
	
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		//Passing webDriver to webelement using PageFactory class
		PageFactory.initElements(driver, LoginNotUsingFindBy.class);
		
		//Passing values to webelement using webelement ID
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
		
		
	}

}

package testPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModTest.PageObjUsingPgFactory;

public class LoginUsingPgFactory {
	
	@Test
	public void LoginPage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Using built=in class PageFactory and function initElement, passing driver to the script
		
		PageFactory.initElements(driver, PageObjUsingPgFactory.class);
		
		//Identifying element and passing values are simplified using Page Factory
		PageObjUsingPgFactory.Username.sendKeys("Admin");
		PageObjUsingPgFactory.Password.sendKeys("admin123");
		PageObjUsingPgFactory.LoginBtn.click();
		
		driver.quit();
		
	}

}

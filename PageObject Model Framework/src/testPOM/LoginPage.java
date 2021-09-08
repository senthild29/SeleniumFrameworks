package testPOM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModTest.PageObjectLogin;


public class LoginPage {
	
	@Test
	public void HandleWebElements() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
			
		PageObjectLogin.UserName(driver).sendKeys("Admin");
		//WebElement un = driver.findElement(By.id("txtUsername"));
		//un.sendKeys("Admin");
		
		PageObjectLogin.PassWord(driver).sendKeys("admin123");
		//WebElement pwd = driver.findElement(By.id("txtPassword"));
		//pwd.sendKeys("admin123");
		
		PageObjectLogin.LoginBtn(driver).click();
		//WebElement Lgnbtn = driver.findElement(By.id("btnLogin"));
		//Lgnbtn.click();
		
		driver.quit();

		
	}
	

}

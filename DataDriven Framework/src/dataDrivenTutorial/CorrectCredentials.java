package dataDrivenTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectCredentials {
	
	@Test
	@Parameters({"UserName", "Password"})
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

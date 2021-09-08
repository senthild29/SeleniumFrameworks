package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModTest.PageObjUsingPgFactory;
import pageObjectModTest.PageObjectLogin;
import pageObjectModTest.PgObjAdminPgFactory;

public class AdminPageFactory {
	
	@Test
	public void AdminPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, PageObjUsingPgFactory.class);
		
		PageObjUsingPgFactory.Username.sendKeys("Admin");
		PageObjUsingPgFactory.Password.sendKeys("admin123");
		PageObjUsingPgFactory.LoginBtn.click();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, PgObjAdminPgFactory.class);
		
		PgObjAdminPgFactory.AdminLink.click();
		Thread.sleep(2000);
		PgObjAdminPgFactory.TextBox.sendKeys("David.Morris");
		PgObjAdminPgFactory.SrchBtn.click();
		
		/*Using Page Factory drastically reduces the no of line in coding
		 * WebElement un = driver.findElement(By.id("txtUsername"));
		 * un.sendKeys("Admin");
		 * 
		 * 
		 * WebElement pwd = driver.findElement(By.id("txtPassword"));
		 * pwd.sendKeys("admin123");
		 * 
		 * WebElement Lgnbtn = driver.findElement(By.id("btnLogin")); Lgnbtn.click();
		 * Thread.sleep(3000);
		 * 
		 * WebElement AdminLink =
		 * driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		 * AdminLink.click(); Thread.sleep(2000);
		 * 
		 * WebElement txtBox = driver.findElement(By.id("searchSystemUser_userName"));
		 * txtBox.sendKeys("David.Morris");
		 * 
		 * WebElement srchBtn = driver.findElement(By.id("searchBtn")); srchBtn.click();
		 */
		
		driver.quit();
		
				
	}

}

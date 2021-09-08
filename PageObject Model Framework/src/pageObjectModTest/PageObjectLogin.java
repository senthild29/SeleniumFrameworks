package pageObjectModTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectLogin {
	


	public static WebElement UserName(WebDriver driver) {

		return driver.findElement(By.id("txtUsername"));
		

	}

	public static WebElement PassWord(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
		
	}

	public static  WebElement LoginBtn(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));
		 

	}


}

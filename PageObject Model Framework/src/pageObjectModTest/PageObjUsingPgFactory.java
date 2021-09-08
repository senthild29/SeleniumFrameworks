package pageObjectModTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjUsingPgFactory {

	//Using @findBy annotations identifying the webElement without using findElement () function
	//Also not created any separate method() to identify each webElement
	@FindBy(id="txtUsername")
	public static WebElement Username; //Created variable using "static" keyword and return type "WebElement"
	
	@FindBy(id="txtPassword")
	public static WebElement Password;
	
	@FindBy(id="btnLogin")
	public static WebElement LoginBtn;
	
		
}

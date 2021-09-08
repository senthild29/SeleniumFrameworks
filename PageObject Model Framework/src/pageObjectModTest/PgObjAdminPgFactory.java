package pageObjectModTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PgObjAdminPgFactory {
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	public static WebElement AdminLink;
	
	@FindBy(id = "searchSystemUser_userName")
	public static WebElement TextBox;
	
	@FindBy(id="searchBtn")
	public static WebElement SrchBtn;
	
	

}

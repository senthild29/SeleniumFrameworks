package testNGTutorial;

import org.testng.annotations.Test;

public class Dependencies {
	
	@Test
	public void openSite() {
		System.out.println("Amazon site Opened");
	}
	
	@Test(dependsOnMethods = "openSite", enabled = false )
	public void loginSite() {
		System.out.println("Enter Credentials and log in");
	}
	
	@Test(dependsOnMethods = "loginSite" )
	public void SearchProduct() {
		System.out.println("Browse the Product");
	}
	
	@Test(dependsOnMethods = "SearchProduct" )
	public void AddCart() {
		System.out.println("Add the Product to Cart");
	}

}

package testNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite { //Creating a class TestSuite

	WebDriver driver; //Declaring variables globally to use it in many test cases.
	long starTime; // Declaring variable to get the system time(Execution Start Time) 
	long endTime; // Declaring variable to get the system time(Execution End Time) 

	@BeforeSuite //Using @BeforeSuite annotation, opening browser
	public void OpenBrowser() {
		starTime = System.currentTimeMillis(); //Using this method getting System time in Milli seconds
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test // Open Google site
	public void OpenGoogle() {
		driver.get("https://www.google.co.in/");

	}

	@Test // Open Amazon site
	public void OpenAmazon() {
		driver.get("https://www.amazon.in/");

	}

	@Test //Open flipkart site
	public void OpenFlipkart() {
		driver.get("https://www.flipkart.com/");

	}

	@AfterSuite //Using @AfterSuite annotation, closing browser and calculating the total time take to execute all the test case.
	public  void CloseBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis(); //Using this method getting System time in Milliseconds
		long TotalTime = endTime-starTime; // Calculating total time taken for execution 
		System.out.println("Total time take to complete this execution : "+TotalTime);
	}
}

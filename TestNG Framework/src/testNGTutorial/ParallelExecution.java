package testNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void OpenAmazon() {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
	
	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers_2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
	}

}

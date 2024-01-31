package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * All tests extend this to set up and destroy the browser
 */
public class BaseTest {

	private WebDriver driver; 
	
	
	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		// make it headless and optionally, how would I run this through CI?
	}
	
	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}

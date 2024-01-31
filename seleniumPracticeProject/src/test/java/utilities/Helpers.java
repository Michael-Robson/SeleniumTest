package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Helpers {

	/**
	 * Asserts if the expected text is found in the page source for the current page
	 * @param driver - WebDriver instance
	 * @param expectedText - text to look for
	 */
	public void assertTextOnPage(WebDriver driver, String expectedText) {
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains(expectedText), expectedText + " Was not found on the page");
	}
}

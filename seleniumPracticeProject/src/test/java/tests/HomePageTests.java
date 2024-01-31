package tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilities.BaseTest;
import utilities.Helpers;

public class HomePageTests extends BaseTest {

	private WebDriver driver;
	
	@BeforeClass()
	public void getWebDriver() {
		driver = getDriver();
	}
	
	@Test
	public void assertHomepageLooksCorrect() {
		HomePage homePage = new HomePage(driver);
		
		// Assert header present and contains correct text
		homePage.assertHeaderPresent();
		homePage.assertHeaderText("Welcome to the-internet");
		
		// Assert subHeading present and contains correct text
		homePage.assertSubheadingPresent();
		homePage.assertSubheadingText("Available Examples");
		
		// Assert we have the correct number of links
		homePage.assertNumberOfLinks(44);
	}
	
	@Test
	public void assertFooterOnPage() {
		// Just showing a way to see if text is on the page using a custom command, in real like you wouldn't do it this way
		String expectedText = "Powered by ";
		Helpers helpers = new Helpers();
		helpers.assertTextOnPage(driver, expectedText);
		
	}
}

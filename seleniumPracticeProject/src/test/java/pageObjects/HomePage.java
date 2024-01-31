package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	
	@FindBy(css = "h1[class='heading']")
	WebElement Header;
	
	
	@FindBy(css = "h2")
	WebElement SubHeading;
	
	@FindBy(css = "ul li a")
	List<WebElement> AllLinks;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Asserts if the header element is displayed on the page
	 */
	public void assertHeaderPresent() {
		boolean present = Header.isDisplayed();
		Assert.assertTrue(present, "Header element not found.");
	}
	
	/**
	 * Asserts the header text is what we expect it to be
	 * @param expectedText - The string we expect to have
	 */
	public void assertHeaderText(String expectedText) {
		String actual = Header.getText();
		Assert.assertEquals(actual, expectedText);
	}
	
	/**
	 * Asserts the subheading is displayed on the page
	 */
	public void assertSubheadingPresent() {
		boolean present = SubHeading.isDisplayed();
		Assert.assertTrue(present, "Subheading element not found");
	}
	
	/**
	 * Asserts the subheading text is the value we expect
	 * @param expectedText - expected text of subheading
	 */
	public void assertSubheadingText(String expectedText) {
		String actual = SubHeading.getText();
		Assert.assertEquals(actual, expectedText);
	}
	
	/**
	 * Asserts we have the correct number of links on the page
	 * @param expectedNumber - the number of links we expect to find.
	 */
	public void assertNumberOfLinks(int expectedNumber) {
		int numberOfLinks = AllLinks.size();
		Assert.assertEquals(numberOfLinks, expectedNumber);
	}
	
	// DO THE ASSERT LINKS ARE CORRECT METHOD LOOPGIN THROUGH JSON FILE!!
}

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class custom_util {

	/* NEED TO SOMEHOW IMPLEMENT THIS TO OUR PAGEOBJECTS AND STEPDEFINITIONS FILES
	
	//Handles locator type
	public static By ByLocator(String locator) {
		By result = null;

		if (locator.startsWith("//")) {
			result = By.xpath(locator);
			
		} else if (locator.startsWith("css=")) {
			result = By.cssSelector(locator.replace("css=", ""));
			
		} else if (locator.startsWith("name=")) {
			result = By.name(locator.replace("name=", ""));
			
		} else if (locator.startsWith("link=")) {
			result = By.linkText(locator.replace("link=", ""));
			
		} else {
			result = By.id(locator);
		}
		return result;
	}
	
	
	public static void clickOn(String locator) {
		WebElement element = getWebDriver().findElement(ByLocator(locator));
		element.click();
	}
	
  */

}

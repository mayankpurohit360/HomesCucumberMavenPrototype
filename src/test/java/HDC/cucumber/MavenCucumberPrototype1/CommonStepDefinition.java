package HDC.cucumber.MavenCucumberPrototype1;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;

import HDC.cucumber.pageobject.HomePagePortal;
import HDC.cucumber.pageobject.SearchPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/*
public class CommonStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	HomePagePortal homePagePortal = getHomePagePorta();
	SearchPage searchPage = getSearchPage();
	
	@Then("^I close the browser$")
	public void CloseTheBrowser() throws Throwable {
	    driver.close();
	    driver = null;
	    System.out.println("CLosed Driver.  ");
	    System.out.println("Driver Value: "+driver);
	}
	
	
}	
	
*/
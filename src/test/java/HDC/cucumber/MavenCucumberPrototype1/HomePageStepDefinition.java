package HDC.cucumber.MavenCucumberPrototype1;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
public class HomePageStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	HomePagePortal homePagePortal = getHomePagePorta();
	SearchPage searchPage = getSearchPage();
	
	@Given("^I am on the home page$")
	public void NavigateToHomePage() throws Throwable {
	    //driver.get("http://homes.com");
		homePagePortal = new HomePagePortal(driver);
		homePagePortal.NavigateToWebApp();
	    System.out.println("Executed navigation");	    
	}

	@When("^I enter \"([^\"]*)\" in the search field$")
	public void PopulateSearchPage (String value) throws Throwable {
		System.out.println("Searched City: "+value);	
		homePagePortal.setSearchField(value);

	}

	@When("^I click the search button$")
	public void ClickTheSearchButton() throws Throwable {
		//driver.findElement(By.cssSelector(".media>input")).click();
		searchPage = homePagePortal.clickSearchButton();
	}
	
	
	@And("^I select For Rent$")
	public void SelectForRent() throws Throwable{
		homePagePortal.clickSearchDropDown();
		homePagePortal.SelectForRent();
	}
	
	
}
*/
	

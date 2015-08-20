package HDC.cucumber.MavenCucumberPrototype1;

import org.openqa.selenium.WebDriver;

import HDC.cucumber.pageobject.HomePagePortal;
import HDC.cucumber.pageobject.SearchPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


/*
public class SearchPageStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	HomePagePortal homePagePortal = getHomePagePorta();
	SearchPage searchPage = getSearchPage();
	
	@Then("^I check the title contains \"([^\"]*)\"$")
	public void CheckTitle(String title) throws Throwable {
		Thread.sleep(3000);
		
		System.out.println("The Expected Title to include:"+title);
		System.out.println("The Actual H1 is             :"+searchPage.getPageTitle());
		  
		Assert.assertTrue("Not on search Page", searchPage.getPageTitle().contains(title));		
	}
	
	@Then("^I can see number of results on the search page$")
	public void SeeNumberOfResults() throws Throwable {
		
		System.out.println("Number Of Results: "+searchPage.numberOfResults());
		
	}
	
	@Then("^I check the header is \"([^\"]*)\"$")
	public void CheckHeader(String header) throws Throwable {
		Thread.sleep(3000);
		  	
		System.out.println("The Expected H1 is :"+header);
		System.out.println("The Actual H1 is   :"+searchPage.getHeader());
		
		Assert.assertTrue("Not on search Page", searchPage.getHeader().equals(header));
			    
	}

}
*/
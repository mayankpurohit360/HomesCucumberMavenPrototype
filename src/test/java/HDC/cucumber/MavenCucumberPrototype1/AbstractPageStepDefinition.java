package HDC.cucumber.MavenCucumberPrototype1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import HDC.cucumber.pageobject.HomePagePortal;
import HDC.cucumber.pageobject.SearchPage;


////// BEFORE IMPLEMENTING THE SEPERATE STEP DEFINITION FILES, 
////// I need to figure out how to implement hooks with multiple step definition files.

/*
public class AbstractPageStepDefinition {	
	
	protected static WebDriver driver;
	protected WebDriver getDriver(){
		System.out.println("Before creating the driver in the Abstract Class driver = "+driver);

		if (driver == null){
			driver = new FirefoxDriver();
			System.out.println("Created new driver Object in the Abstarct Class ="+driver);
			
		} else {
			System.out.println("Did no create new driver Object in the Abstarct Class");
			
		}
		
		return driver;		
	}
	protected WebDriver resetDriver(){
		driver = null;
		return driver; 
	}
	
	protected static HomePagePortal homePagePortal;
	protected HomePagePortal getHomePagePorta(){
		if ( homePagePortal == null){
			homePagePortal = new HomePagePortal(driver);
		}
		return homePagePortal;		
	}
	
	protected static SearchPage searchPage;
	protected SearchPage getSearchPage(){
		if ( searchPage == null){
			searchPage = new SearchPage(driver);
		}
		return searchPage;		
	}

}
*/
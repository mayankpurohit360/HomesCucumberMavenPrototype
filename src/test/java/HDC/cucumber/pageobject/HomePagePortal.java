package HDC.cucumber.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.custom_util;

public class HomePagePortal extends AbstractPage {
	
	//Home Page Constructor 
	public HomePagePortal(WebDriver driver){
		super(driver);
	}
	
	//Home Page variables 
	By SearchButton = By.cssSelector(".media>input");
	By SearchBox    = By.id("listing-location");
	By DropDown     = By.cssSelector(".title");
	By ForRent      = By.xpath("//div[@class='selectbox _listing-status']/div[2]/ul/li/span[text()='For Rent']");
	
	
	//Home Page Methods
	public HomePagePortal setSearchField(String value){
		WebElement element = driver.findElement(SearchBox);
		element.clear();
		element.sendKeys(value);	
		return new HomePagePortal(driver);
	}
	
	public HomePagePortal clickSearchDropDown(){
		driver.findElement(DropDown).click();
		return new HomePagePortal(driver);		
	}
	
	
	public HomePagePortal SelectForRent(){
		WebElement element = driver.findElement(ForRent);	
		element.click();
		return new HomePagePortal(driver);		
	}
	
	
	public SearchPage clickSearchButton(){
		driver.findElement(SearchButton).click();
		return new SearchPage (driver);		
	}
	
	
	

}

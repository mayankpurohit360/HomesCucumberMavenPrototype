package HDC.cucumber.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AbstractPage  {
	
	protected WebDriver driver;
	
	public String env = "staging";
	//public String env = "dev";
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
	}
	
	public String homePage    = "http://"+env+".homes.com";
	public String forSaleUDP  = "http://"+env+".homes.com/property/123-any-where-ln-your-hometown-fl-33333/id-234734399/";
	public String forSaleSRP  = "http://"+env+".homes.com/for-sale/your-hometown-fl/?orderby=price desc";
	public String builderUDP  = "http://"+env+".homes.com/property/the-chapel-hill-fl-33333/id-2159229/";
	public String forRentUDP  = "http://"+env+".homes.com/property/555-street-ln-your-hometown-fl-33333/id-218079618/";
	public String forRentSRP  = "http://"+env+".homes.com/rentals/your-hometown-fl/?maxprice=1500&minprice=1500";
	//public String FRC_UDP     = "http://"+env+".homes.com/property/christina-lakes-far-south-alaska-ketchikan-ketchikan-ak-99901/id-190682294/";
	public String FRC_UDP     = "http://www.homes.com/property/christina-lakes-far-south-alaska-ketchikan-ketchikan-ak-99901/id-190682294/";
	public String FRC_SRP     = "http://"+env+".homes.com/rentals/ketchikan-ak/";
		
	
	public void waitFiveSeconds(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}	
	
	
	//////////////// Home Page ///////////////////
	public HomePagePortal NavigateToWebApp(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(homePage);
		return new HomePagePortal (driver);			
	}
	
	//////////////////  UDP ///////////////////
	public DetailPage NavigateToBuilderUDP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(builderUDP);
		return new DetailPage (driver);		
	}
	
	public DetailPage NavigateToForSaleUDP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(forSaleUDP);
		return new DetailPage (driver);		
	}
	
	public DetailPage NavigateToFoRentUDP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(forRentUDP);
		return new DetailPage (driver);		
	}
	
	public DetailPage NavigateToFRC_UDP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(FRC_UDP);
		return new DetailPage(driver);
	}
	
	//////////////////  SRP ///////////////////
	public SearchPage NavigateToFoRentSRP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(forRentSRP);
		return new SearchPage (driver);		
	}
	
	public SearchPage NavigateToFRC_SRP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(FRC_SRP);
		return new SearchPage (driver);		
	}
	
	public SearchPage NavigateToForSaleSRP(){
		System.out.println("Running on: "+ env);
		driver.navigate().to(forSaleSRP);
		return new SearchPage (driver);		
	}
	
	public requestPageMRH MortageRequestConnectPage(){
		//driver.navigate().to("http://www.homes.com/property/the-chapel-hill-fl-33333/id-2159229/");
		driver.navigate().to("http://www.homes.com/Content/MortgageRequestConnect.cfm/");
		driver.manage().window().maximize();
		return new requestPageMRH (driver);
			
	}
	public requestPageMRH MortageRefiRequestPage(){
		//driver.navigate().to("http://www.homes.com/property/the-chapel-hill-fl-33333/id-2159229/");
		driver.navigate().to("http://www.homes.com/Content/RefiRequest.cfm");
		driver.manage().window().maximize();
		return new requestPageMRH (driver);
			
	}
	
	public requestPageMRH MortageRequestHomeEstimate(){
		//driver.navigate().to("http://www.homes.com/property/the-chapel-hill-fl-33333/id-2159229/");
		driver.navigate().to("http://www.homes.com/Content/SoldHomesRequest.cfm");
		driver.manage().window().maximize();
		return new requestPageMRH (driver);
			
	}
	
	public DetailPage MortageSalePage(){
		//driver.navigate().to("http://www.homes.com/property/the-chapel-hill-fl-33333/id-2159229/");
		driver.navigate().to("http://www.homes.com/property/1410-bolling-ave-norfolk-va-23508/id-400028624011/");
		driver.manage().window().maximize();
		return new DetailPage (driver);
			
	}
	public DetailPage SaledetailPageInformaWidget(){
		//driver.navigate().to("http://www.homes.com/property/the-chapel-hill-fl-33333/id-2159229/");
		driver.navigate().to("http://www.homes.com/property/6048-churchill-ct-ketchikan-ak-99901/id-700019420311/");
		driver.manage().window().maximize();
		return new DetailPage (driver);
			
	}

}

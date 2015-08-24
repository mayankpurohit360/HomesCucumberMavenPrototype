package HDC.cucumber.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class requestPageMRH extends AbstractPage {
	
	//Detail Page Constructor
	public requestPageMRH(WebDriver driver) {
		super(driver);
	}
	 By PopulateLoanAmountValue    = By.id("loanAmount");
	   By DownPayementDropDownValue  = By.xpath("//select[@id='downpayment']");
	   By CreditCardDropDownValue  =   By.xpath("//select[@id='score']");
	   By EntercitynameValue=          By.xpath("//input[@id='city']");
	   By StateDropDownValue=          By.xpath("//select[@id='state']");
	   By firstnameValue=              By.xpath("//input[@id='first']");
	   By lastnamevalue                =By.xpath("//input[@id='last']");
	   By PhoneNumberField             = By.xpath("//input[@id='phone']");
	   By EmailfieldMortagePageValue    =By.xpath("//input[@id='email']");
	   By PrequalifiedButtonMortagePageLocator= By.xpath("//input[@id='submiter']");
	   By SelectBankruptcyOptionLocator=By.id("bankruptcyHistory");
	   By EstimatePropertyValuefieldLocator= By.xpath("//input[@id='est_prop_val']");
	   By SubmitRequestonRefiRequestlocator= By.xpath("//input[@id='submit']");
	   By StreetAddressonMortageLocator=By.xpath("//input[@id='streetAddress']");
	   By RequestHomeZipFieldlocator=By.xpath("//input[@id='zip']");
	   By submitCMARequestFormLocator=By.xpath("//input[@id='submitCMARequestForm']");
	   By MatchMortageMessage=By.xpath("//div[@id='mortgageOffers']//h2[text()='Estimated Mortgage Rates']");
	   By SeeEstimateMortageRateModule =By.xpath("//div[@id='mortgageOffers']");
	   By MortageBankRateCreditScoreSlider= By.xpath("//div[@class='ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']");
	   By DragSliderLeft =By.xpath("//div[@id='_bankrateSliders']/div/div[2]/a");
	   By DragSliderLeft1=By.xpath("//div[@class='layout-detail frame-content']");
	  By DragSliderRightShift =By.xpath("//div[@id='_bankrateSliders']/div/div[2]/a");
	  By DragSliderRightShift1=By.xpath("//div[@class='layout-detail frame-content']");
	  By MortageBankRateDownPayementScoreSlider= By.xpath("//div[@class='ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']");
	  By DragdownpayementSliderRightShift =By.xpath("//div[@id='_bankrateSliders']/div[2]/div[2]/a");
	 By DragdownpayementSliderRightShift1= By.xpath("//div[@class='layout-detail frame-content']");
	By DragdownpayementSliderLeftShift= By.xpath("//div[@id='_bankrateSliders']/div[2]/div[2]/a");
	By DragdownpayementSliderLeftShift1=By.xpath("//div[@class='layout-detail frame-content']");
	By ClickBankDisclaimerlink=By.xpath("//div[@id='mortgageOffers']//table[@class='bankrate-table-footer']//td//a[@class='_bankrate_disclaimer bankrate_disclaimer']");
	By MatchDisclamierSecondPara= By.xpath("//div[@id='BankRateDisclaimer']//p[2]"); 
	By ClickBankRateAdditiobalButtonlink=By.xpath("//div[@id='mortgageOffers']/div/div/table[2]/tbody/tr/td[2]/a[2]");
	By MatchRatePageMortageMessage= By.xpath("//div[@class='frame-subheader']//h1[text()='Compare Norfolk, VA Mortgage Rates']");
	public DetailPage ScrollMortgagePopertyDetailPageUDP() throws InterruptedException
	{


		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2400)", "");
	driver.manage().timeouts().implicitlyWait(2000000000, TimeUnit.SECONDS);
		return new DetailPage(driver);

	}
	
	public String MatchMortageMessage(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(MatchMortageMessage);	
		return element.getText();
		
	}
	public DetailPage SeeEstimateMortageRateModule() {
		WebElement element = driver.findElement(SeeEstimateMortageRateModule);
		//element.click();
		return new DetailPage(driver);
		
	}
	public DetailPage MortageBankRateCreditScoreSlider() {
		WebElement element = driver.findElement(MortageBankRateCreditScoreSlider);
		//element.click();
		return new DetailPage(driver);
		
	}
	public String MatchExcellentMessage(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(By.xpath("//div[@id='mortgageOffers']//span[text()='"+Message+"']"));	
		return element.getText();
		
	}
	public DetailPage DragSliderLeft() throws InterruptedException
	{
		//Slider1();
		  WebElement element = driver.findElement(DragSliderLeft);
		 WebElement element1 = driver.findElement(DragSliderLeft1);
		//  System.out.println("****************Print Message In Slider****************"+mes1);
		   Thread.sleep(3000);
		      element.click();
		      Robot robot = null;
			try 
			{
				robot = new Robot();
			} catch (AWTException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      Actions move = new Actions(driver);
		      element.click();
		      element1.click(); 
		   
		      Thread.sleep(10000);
		      for (int i = 1; i<=80; i++)
		      {
		    	 
		      element.click();
		     
		        robot.keyPress(KeyEvent.VK_DOWN);
		 
		       }
		      
		      Thread.sleep(10000);
		      return new DetailPage(driver); 
		    
	}

	public DetailPage DragSliderRightShift() throws InterruptedException
	{
		//SliderRight();
		System.out.println("----SLIDER FUNCTION CALLED______");
		  WebElement element = driver.findElement(DragSliderRightShift);
		 WebElement element1 = driver.findElement(DragSliderRightShift1);
		//  System.out.println("****************Print Message In Slider****************"+mes1);
		   Thread.sleep(3000);
		      element.click();
		      Robot robot = null;
			try 
			{
				robot = new Robot();
			} catch (AWTException e) 
			{
			
				e.printStackTrace();
			}
		      Actions move = new Actions(driver);
		      element.click();
		      element1.click(); 
		
		      Thread.sleep(10000);
		      for (int i = 1; i<=40; i++)
		      {
		
		      element.click();
		  
		      robot.keyPress(KeyEvent.VK_UP);
		       
		       }
		      
		      Thread.sleep(10000);
		      return new DetailPage(driver);
	//	return new DetailPage(driver);
	}
	public DetailPage MortageBankRateDownPayementScoreSlider() {
		WebElement element = driver.findElement(MortageBankRateDownPayementScoreSlider);
		//element.click();
		return new DetailPage(driver);
		
	}
	public String MatchCreditScore(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(By.xpath("//div[@id='mortgageOffers']//span[text()='"+Message+"']"));	
		return element.getText();
		
	}
	
	public DetailPage DragdownpayementSliderRightShift() throws InterruptedException
	{
		  WebElement element = driver.findElement(DragdownpayementSliderRightShift);
			 WebElement element1 = driver.findElement(DragdownpayementSliderRightShift1);
			//  System.out.println("****************Print Message In Slider****************"+mes1);
			   Thread.sleep(3000);
			      element.click();
			      Robot robot = null;
				try 
				{
					robot = new Robot();
				} catch (AWTException e) 
				{
					
					e.printStackTrace();
				}
			      Actions move = new Actions(driver);
			      element.click();
			      element1.click(); 
			     
			      Thread.sleep(10000);
			      for (int i = 1; i<=20; i++)
			      {
			    	
			      element.click();
			    
			      robot.keyPress(KeyEvent.VK_UP);
			      
			       }
			      
			      Thread.sleep(10000);
			      return new DetailPage(driver); 
	}
	public DetailPage DragdownpayementSliderLeftShift() throws InterruptedException
	{
		  WebElement element = driver.findElement(DragdownpayementSliderLeftShift);
			 WebElement element1 = driver.findElement(DragdownpayementSliderLeftShift1);
			//  System.out.println("****************Print Message In Slider****************"+mes1);
			   Thread.sleep(3000);
			      element.click();
			      Robot robot = null;
				try 
				{
					robot = new Robot();
				} catch (AWTException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      Actions move = new Actions(driver);
			      element.click();
			      element1.click(); 
			    
			      Thread.sleep(10000);
			      for (int i = 1; i<=40; i++)
			      {
			    	
			      element.click();
			     
			        robot.keyPress(KeyEvent.VK_DOWN);
			    
			       }
			      
			      Thread.sleep(10000);
			      return new DetailPage(driver);
	}
	public DetailPage ClickBankDisclaimerlink(){

		WebElement element = driver.findElement(ClickBankDisclaimerlink);
		
	element.click();
	return new DetailPage(driver);
	}
	public String MatchDisclamierValueText(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(By.xpath("//div[@id='BankRateDisclaimer']//p[text()='"+Message+"']"));	
		return element.getText();
		
	}
	public String MatchDisclamierSecondPara(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(MatchDisclamierSecondPara);	
		return element.getText();
		
	}
	public DetailPage CloseDisclaimerpopup() {
		 System.out.println("****************Disclamer popup****************");
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		return new DetailPage(driver);
	}
	public DetailPage ClickBankRateAdditiobalButtonlink(){

		WebElement element = driver.findElement(ClickBankRateAdditiobalButtonlink);
		
	element.click();
	return new DetailPage(driver);
	}
	public String MatchRatePageMortageMessage(String Message){
		System.out.println("****************************Locator*************************************************************");
		WebElement element = driver.findElement(MatchRatePageMortageMessage);	
		return element.getText();
		
	}
	public DetailPage ScrollMortgagePopertyDetailPageUDPForInforma() throws InterruptedException
	{


		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)", "");
	driver.manage().timeouts().implicitlyWait(2000000000, TimeUnit.SECONDS);
		return new DetailPage(driver);

	}
////////////////////////////////Mortgage Detail Page////////////////////////////////////////////
public DetailPage PopulateLoanAmountValue(String value) throws InterruptedException
{
System.out.println("Value on function"+value);	
WebElement element = driver.findElement(PopulateLoanAmountValue);
element.clear();
element.sendKeys(value);	
return new DetailPage(driver);
}

public DetailPage DownPayementDropDown(String value){
WebElement ele	=	driver.findElement(DownPayementDropDownValue);
Select sel	=	new Select(ele);
sel.selectByVisibleText(value);
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}

public DetailPage CreditCardDropDown(String value){
WebElement ele	=	driver.findElement(CreditCardDropDownValue);
Select sel	=	new Select(ele);
sel.selectByVisibleText(value);
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}
public DetailPage Entercityname(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(EntercitynameValue);
element.clear();
element.sendKeys(value);
//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}

public DetailPage StateDropDown(String value){
driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
WebElement ele	=	driver.findElement(StateDropDownValue);
Select sel	=	new Select(ele);
sel.selectByVisibleText(value);
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}
public DetailPage firstname(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(firstnameValue);
element.clear();
element.sendKeys(value);
//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}

public DetailPage lastname(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(lastnamevalue);
element.clear();
element.sendKeys(value);
//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}
public DetailPage PhonefieldMortagePage(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(PhoneNumberField);
element.clear();
element.sendKeys(value);
//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}

public DetailPage EmailfieldMortagePage(String value){
//System.out.println("Searched City: "+value);
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(EmailfieldMortagePageValue);
element.clear();
element.sendKeys(value);

//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}

public DetailPage PrequalifiedButtonMortagePage(){
WebElement element = driver.findElement(PrequalifiedButtonMortagePageLocator);

element.click();
return new DetailPage(driver);
}

public DetailPage SelectBankruptcyOption(String value){
WebElement ele	=	driver.findElement(SelectBankruptcyOptionLocator);
Select sel	=	new Select(ele);
sel.selectByVisibleText(value);
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
return new DetailPage(driver);
}

public DetailPage EstimatePropertyValuefield(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(EstimatePropertyValuefieldLocator);
element.clear();
element.sendKeys(value);
return new DetailPage(driver);
}

public DetailPage ClickSubmitRequestonRefiRequest(){
WebElement element = driver.findElement(SubmitRequestonRefiRequestlocator);
element.click();
return new DetailPage(driver);
}

public DetailPage EnterStreetAddressonMortage(String value){
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(StreetAddressonMortageLocator);
element.clear();
element.sendKeys(value);
return new DetailPage(driver);
}

public DetailPage RequestHomeZipField(String value){
System.out.println("****************************Request Home field************************************************");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
WebElement element = driver.findElement(RequestHomeZipFieldlocator);
element.clear();
element.sendKeys(value);
//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new DetailPage(driver);
}
public DetailPage submitCMARequestForm()
{

WebElement element = driver.findElement(submitCMARequestFormLocator);
//element.click();

element.click();
return new DetailPage(driver);

}
	
}

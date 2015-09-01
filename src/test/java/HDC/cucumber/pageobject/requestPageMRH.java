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
	   
	
	////////////////////////////////Mortgage Detail Page////////////////////////////////////////////
public requestPageMRH EnterValueInTargetField(String value, String arg2) throws InterruptedException
{
System.out.println("Value on function"+value);	
WebElement element = driver.findElement(By.id(arg2));
element.clear();
element.sendKeys(value);	
return new requestPageMRH(driver);
}

public requestPageMRH SelectValueFromTargetDropDown(String value, String arg2){
WebElement ele	=	driver.findElement(By.id(arg2));
Select sel	=	new Select(ele);
sel.selectByVisibleText(value);
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

return new requestPageMRH(driver);

}

public requestPageMRH PrequalifiedButtonMortagePage(){
WebElement element = driver.findElement(PrequalifiedButtonMortagePageLocator);
element.click();
return new requestPageMRH(driver);
}


public requestPageMRH ClickSubmitRequestonRefiRequest(){
WebElement element = driver.findElement(SubmitRequestonRefiRequestlocator);
element.click();
return new requestPageMRH(driver);
}

public requestPageMRH submitCMARequestForm()
{

WebElement element = driver.findElement(submitCMARequestFormLocator);
//element.click();
element.click();
return new requestPageMRH(driver);

}
	
}

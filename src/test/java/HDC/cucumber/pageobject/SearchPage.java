package HDC.cucumber.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbstractPage {
	
	//Search Page Constructor
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	//Search Page Variables
	By numOfResults          = By.cssSelector(".top-totalNumber._totalRecordCount._topHeader");
	By header1               = By.cssSelector(".ellipsisT.h1");
	By header1School         = By.cssSelector(".full.results-top>h1");
	By requestButton         = By.cssSelector(".action-envelope._agentCardLink");	
	By checkAvailability     = By.xpath("html/body/div[1]/div[1]/div/div[2]/div[4]/div[1]/div[2]/button[1]");	
	By agentContactForm	     = By.id("agentCardContactForm");
	By creditScoreButton     = By.id("moving_opt_in");
	By sendButton            = By.id("agent_card_submit");
	By mainConfirmationForm  = By.cssSelector(".ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-draggable.lightbox-saveListingCTA");	
	By CreditRepairButton    = By.cssSelector(".button._skipLexington");
	By LocoForm              = By.id("myHomesOverlayAgentCard");
	By ProgrexionLightBox    = By.id("movingQuotesForm");
	By sendButtonFRC         = By.id("for_rent_card_submit");
	By DownPaymentDropdown   = By.name("downPayment");
	By LeadConfirmation		 = By.id("leadConfirm");
	By PrequalifyButton 	 = By.id("mortLBFormButton");
	By PrequalifyBox         = By.xpath("html/body/div[4]/div[2]/div/form/div[2]/div[3]/div[1]/label");
	
	//Search Page Methods
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public boolean isLocalConnectFormPresent(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LocoForm));
		WebElement element = driver.findElement(LocoForm);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	public SearchPage PopulateFieldSRP(String arg1, String arg2){
		WebElement formElement = driver.findElement(agentContactForm);
		WebElement element = formElement.findElement(By.name(arg2));
		element.clear();
		element.sendKeys(arg1);
		return new SearchPage(driver);	
	}
	
	public String numberOfResults(){
		WebElement element = driver.findElement(numOfResults);	
		return element.getText();			
	}
	
	public String getHeader(){
		WebElement element = driver.findElement(header1);	
		return element.getText();			
	}
	
	public String getSchoolHeader(){
		WebElement element = driver.findElement(header1School);	
		return element.getText();			
	}

	public SearchPage clickRequestButton(){
		driver.findElement(requestButton).click();
		return new SearchPage(driver);		
	}
	
	public SearchPage clickCheckAvailability(){
		driver.findElement(checkAvailability).click();
		return new SearchPage(driver);		
	}
	
	public SearchPage ClickSendButton(){	
		WebElement element = driver.findElement(sendButton);
		element.click();
		return new SearchPage(driver);		
	}
	
	public SearchPage ClickSendButtonFRC(){	
		WebElement element = driver.findElement(sendButtonFRC);
		element.click();
		return new SearchPage(driver);		
	}
	
	public SearchPage ClickImproveCreditButton(){
		WebElement element = driver.findElement(creditScoreButton);
		element.click();
		return new SearchPage(driver); 
	}
	
	public boolean IsAgentCardPresent(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(agentContactForm));
		WebElement element = driver.findElement(agentContactForm);
		boolean status = element.isDisplayed();
		return status;				
	}
	
	public boolean IsConfirmationFormPresent(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(mainConfirmationForm));
		WebElement element = driver.findElement(mainConfirmationForm);
		boolean status = element.isDisplayed();
		return status;		
	}
	

	
	public String leadConfirmationForm(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(mainConfirmationForm));
		WebElement element = driver.findElement(mainConfirmationForm);
		String FormText = element.getText();
		return FormText;	
	}
		
	
	public String ForRentProgressionConfirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProgrexionLightBox));
		WebElement element = driver.findElement(ProgrexionLightBox);
		String FormText = element.getText();
		return FormText;	
	}
	
	public SearchPage SelectDropdown(String Value, String DropDown){
		WebElement element = driver.findElement(By.id(DropDown));
		element.sendKeys(Value);
		return new SearchPage(driver);	
	}	
	
	public SearchPage SelectDownPaymentDropdown(String Value){
		WebElement element = driver.findElement(DownPaymentDropdown);
		element.sendKeys(Value);
		return new SearchPage(driver);	
	}	
	
	public boolean Confirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LeadConfirmation));
		WebElement element = driver.findElement(LeadConfirmation);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	public SearchPage ClickPrequalifyButton(){
		WebElement element = driver.findElement(PrequalifyButton);	
		element.click();
		return new SearchPage(driver);
	}
	
	public String LocalConnectConfirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LeadConfirmation));
		WebElement element = driver.findElement(LeadConfirmation);
		String FormText = element.getText();
		return FormText;	
	}
	
	public SearchPage UncheckPrequalifyButton(){
		WebElement element = driver.findElement(PrequalifyBox);
		element.click();
		return new SearchPage(driver);
	}
	
	public DetailPage ClickCreditRepairButton(){
		WebElement element = driver.findElement(CreditRepairButton);
		element.click();
		return new DetailPage(driver); 
	}
	


}

package HDC.cucumber.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailPage extends AbstractPage {
	
	//Detail Page Constructor
	public DetailPage(WebDriver driver) {
		super(driver);
	}
	
	//Detail Page variables
	By PrequalifyButton 	      = By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/form/div[3]/div[1]/div[1]/label");
	By SubmitButton 		      = By.id("_submit");
	By LeadConfirmation		      = By.id("leadConfirm");
	By ProgrexionLightBox         = By.id("myHomesOverlayPropertyLeadSuccessMoving");
	By ThankYouMsg		          = By.id("ui-id-2");
	By DownPaymentDropdown        = By.name("downPayment");
	By PrequalityButton 	      = By.id("mortLBFormButton");
	By CreditRepairButton         = By.cssSelector(".button._skipLexington");
	By NotAtThisTimeButton        = By.cssSelector(".button.blue._skipLexington.underMe.skipLink");
	By CreditRepairCheckBox       = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/form/div[3]/div[1]/div[1]/label");
	By StickyHeaderButton         = By.cssSelector("._agentCardLink.button");
	By StickyContactForm          = By.id("agentContactForm");
	By StickyProgrexionLightBox   = By.id("myHomesOverlayAgentCard");
	By StickyNameField            = By.id("name");
	By StickyEmailField           = By.id("email");
	By StickyPhoneField           = By.id("phone");
	By StickyHeaderSubmit         = By.id("agent_card_submit");
	By StickyHeaderCreditScoreBtn = By.xpath("html/body/div[8]/div[2]/div[2]/form/label[5]/input");
	By CheckAvailabilityOnFRC     = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button");
	By SendButtonFRC_Card         = By.id("for_rent_card_submit");
	By ImproveCreditScoreBox      = By.id("moving_opt_in");
	By LocalSchoolsModuleFS       = By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]");
	By LocalSchoolsToolTip      = By.cssSelector(".icon-tooltip._tooltip");
	By ViewMoreSchoolsLink      = By.cssSelector(".view-more>a");
	By LocalSchoolsModuleFR       = By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[3]");
   
	//Detail Page methods
	public DetailPage PopulateField(String arg1, String arg2){
		WebElement element = driver.findElement(By.id(arg2));
		element.clear();
		element.sendKeys(arg1);	
		return new DetailPage(driver);	
	}
	
	public DetailPage UncheckPrequalifyButton(){
		WebElement element = driver.findElement(PrequalifyButton);
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage UncheckCreditRepairCheckBox(){
		WebElement element = driver.findElement(CreditRepairCheckBox);
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickSubmitButton(){
		WebElement element = driver.findElement(SubmitButton);
		element.click();
		return new DetailPage(driver);		
	}
	
	public String getFormTitle(){
		return driver.getTitle();
	}
	
	public String ForRentProgressionConfirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProgrexionLightBox));
		WebElement element = driver.findElement(ProgrexionLightBox);
		String FormText = element.getText();
		return FormText;	
	}
	
	public String ForRentConfirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LeadConfirmation));
		WebElement element = driver.findElement(LeadConfirmation);
		String FormText = element.getText();
		return FormText;	
	}
	
	public String ThankYouMessage(){
		WebElement element = driver.findElement(ThankYouMsg);	
		return element.getText();	
	}
	
	public DetailPage SelectDropdown(String Value, String DropDown){
		WebElement element = driver.findElement(By.id(DropDown));
		element.sendKeys(Value);
		return new DetailPage(driver);	
	}	
	
	
	public DetailPage SelectDownPaymentDropdown(String Value){
		WebElement element = driver.findElement(DownPaymentDropdown);
		element.sendKeys(Value);
		return new DetailPage(driver);	
	}	
	
	public DetailPage ClickPrequalityButton(){
		WebElement element = driver.findElement(PrequalityButton);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickSendButtonFRC_Card(){
		WebElement element = driver.findElement(SendButtonFRC_Card);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickCreditRepairButton(){
		WebElement element = driver.findElement(CreditRepairButton);
		element.click();
		return new DetailPage(driver); 
	}
	
	
	public boolean Confirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LeadConfirmation));
		WebElement element = driver.findElement(LeadConfirmation);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	public boolean ProgrexionForm(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProgrexionLightBox));
		WebElement element = driver.findElement(ProgrexionLightBox);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	
	////////////// Sticky Header  //////////////
	
	public DetailPage ClickStickyHeader(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		WebElement element = driver.findElement(StickyHeaderButton);
		element.click();
		return new DetailPage(driver);
	}
	
	public boolean IsStickyAgentCardPresent(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StickyContactForm));
		WebElement element = driver.findElement(StickyContactForm);
		boolean status = element.isDisplayed();
		return status;				
	}
	
	public DetailPage PopulateStickyNameField(String arg1){
		WebElement element = driver.findElement(StickyProgrexionLightBox).findElement(StickyNameField);
		element.clear();
		element.sendKeys(arg1);	
		return new DetailPage(driver);		
	}
	
	public DetailPage PopulateStickyEmailField(String arg1){
		WebElement element = driver.findElement(StickyProgrexionLightBox).findElement(StickyEmailField);
		element.clear();
		element.sendKeys(arg1);	
		return new DetailPage(driver);		
	}
	
	public DetailPage PopulateStickyPhoneField(String arg1){
		WebElement element = driver.findElement(StickyProgrexionLightBox).findElement(StickyPhoneField);
		element.clear();
		element.sendKeys(arg1);	
		return new DetailPage(driver);		
	}
	
	public DetailPage ClickStickyHeaderSubmitButton(){
		WebElement element = driver.findElement(StickyHeaderSubmit);	
		element.click();
		return new DetailPage(driver);
	}
	
	public String StickyForRentProgressionConfirmation(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StickyProgrexionLightBox));
		WebElement element = driver.findElement(StickyProgrexionLightBox);
		String FormText = element.getText();
		return FormText;	
	}
	
	public boolean StickyProgrexionForm(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StickyProgrexionLightBox));
		WebElement element = driver.findElement(StickyProgrexionLightBox);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	public DetailPage UncheckStickyCreditRepairButton(){
		WebElement element = driver.findElement(StickyHeaderCreditScoreBtn);
		element.click();
		return new DetailPage(driver); 
	}
	
	//// Local School Module ////
	public String LocalSchoolsModuleText(){
		WebElement element = driver.findElement(LocalSchoolsModuleFS);
		String FormText = element.getText();
		return FormText;		
	}
	
	public String LocalSchoolsModuleTextFR(){
		WebElement element = driver.findElement(LocalSchoolsModuleFR);
		String FormText = element.getText();
		return FormText;		
	}
	
	public String LocalSchoolsToolTipText(){
		WebElement element = driver.findElement(LocalSchoolsModuleFS).findElement(LocalSchoolsToolTip);
		String titleText = element.getAttribute("title");
		return titleText;
	}
	
	public String LocalSchoolsToolTipTextFR(){
		WebElement element = driver.findElement(LocalSchoolsModuleFR).findElement(LocalSchoolsToolTip);
		String titleText = element.getAttribute("title");
		return titleText;
	}
	
	public SearchPage ClickViewMoreSchoolsLink(){
		driver.findElement(ViewMoreSchoolsLink).click();
		return new SearchPage (driver);	
	}
		
	
	//////////////FRC For Rent Card on Detail Page  //////////////
	public DetailPage ClickCheckAvailabilityOnFRC(){
		WebElement element = driver.findElement(CheckAvailabilityOnFRC);
		element.click();
		return new DetailPage(driver); 
	}
	
	
	public DetailPage PopulateField_FRC_Card(String arg1, String arg2){
		WebElement element = driver.findElement(StickyContactForm).findElement(By.id(arg2));
		element.clear();
		element.sendKeys(arg1);	
		return new DetailPage(driver);	
	}
	
	public DetailPage UnCheckImproveCreditScoreBox(){
		WebElement element = driver.findElement(StickyContactForm).findElement(ImproveCreditScoreBox);
		element.click();
		return new DetailPage(driver);		
	}
	
	
	//////////////////////////////// Mortgage Detail Page////////////////////////////////////////////
	/*public DetailPage PopulateLoanAmountValue(String value) throws InterruptedException
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

	}*/
}

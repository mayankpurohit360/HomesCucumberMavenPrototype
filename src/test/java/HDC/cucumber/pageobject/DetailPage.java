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
	//By StickyProgrexionLightBox   = By.id("myHomesOverlayAgentCard");
	By StickyProgrexionLightBox   = By.id("myHomesOverlayPropertyLeadSuccessMoving");
	By StickyProgrexionLightBox1   = By.id("leadConfirm");
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
	By ClickContactNowButtonOnFRC       = By.xpath("//div[@class='frcadditionalproperties']//div[2]//input[@name='contactAdditionalProps']");
    By AddtinalPropertyform =By.xpath("//div[@id='myHomesOverlayAgentCard']");
	//Mortage Bankrate variables
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
	By CloseDisclaimerpopup= By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all lightbox-bankrateDisclaimer']//a");
    By Clicklistingdropdown= By.xpath("//div[@class='filter-section filter-listingType _filterSection']//div");
    By ClickUpdateButtonOnListingType= By.xpath("//button[@class='_updater']");
    By ClickRentalListingTypelocator= By.xpath("//input[@value='RENTALS_NEW-HOME']");
    By ClickSeniorCommunityListingTypelocator=By.xpath("//input[@value='SENIOR COMMUNITY']");
    By ClickCorporateGousingListingTypelocator=By.xpath("//input[@value='CORPORATE HOUSING']");
    By PropertyTypeDropDown=By.xpath("//div[@class='filter-section filter-propertyType _filterSection']//div");
    By UpdateButtononProperptyDropDownLocator=By.xpath("//div[@class='filter-section filter-propertyType _filterSection is-active']//button");
    By ClickAllPropertyTypeLocator=By.xpath("//input[@value='All']");
    By ClickresidentialPropertyTypeLocator= By.xpath("//input[@value='RESIDENTIAL']");
    By ClickTownHousePropertyTypeLocator=By.xpath("//input[@value='TOWNHOUSE']");
    By ClickCondominumPropertyTypeLocator= By.xpath("//input[@value='CONDOMINIUM']");
    By ClickApartmentPropertyTypeLocator= By.xpath("//input[@value='APARTMENT']");
    By CloseMilitaryPopupwindowLocator=By.xpath("//div[@class='srp-veterans-dialog-close']/span");
    // For sale filter locator
    By ClicklistingdropdownonSalePageLocator=By.xpath("//div[@class='results-filter']//div[3]//div");
    
    
    
    
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
	
	public boolean StickyProgrexionLeadForm(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StickyProgrexionLightBox1));
		WebElement element = driver.findElement(StickyProgrexionLightBox1);
		boolean status = element.isDisplayed();
		return status;		
	}
	
	public String StickyForRentProgressionConfirmationText(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StickyProgrexionLightBox1));
		WebElement element = driver.findElement(StickyProgrexionLightBox1);
		String FormText = element.getText();
		return FormText;	
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

	public DetailPage ClickContactNowButtonOnFRC(){
		WebElement element = driver.findElement(ClickContactNowButtonOnFRC);
		element.click();
		return new DetailPage(driver); 
	}
	
	public DetailPage AddtinalPropertyform(){
		WebElement element = driver.findElement(AddtinalPropertyform);
		element.click();
		return new DetailPage(driver); 
	}
	//////////////////////////////// Mortgage SLIDER Bank RATE////////////////////////////////////////////
	public DetailPage ScrollMortgagePopertyDetailPageUDPForInforma() 
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
	//	return new requestPageMRH(driver);
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
	/*	 System.out.println("****************Disclamer popup****************");
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		return new requestPageMRH(driver);
		*/
		
		WebElement element = driver.findElement(CloseDisclaimerpopup);
		//element.click();

		element.click();
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
	public DetailPage ScrollMortgagePopertyDetailPageUDP() throws InterruptedException
	{


		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)", "");
	driver.manage().timeouts().implicitlyWait(2000000000, TimeUnit.SECONDS);
		return new DetailPage(driver);

	}
	///////////////////////////For Rent///////////////////////////////////////////////////////////////////////////
	public DetailPage Clicklistingdropdown(){
		WebElement element = driver.findElement(Clicklistingdropdown);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickUpdateButtonObListingType(){
		WebElement element = driver.findElement(ClickUpdateButtonOnListingType);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickRentalListingType(){
		WebElement element = driver.findElement(ClickRentalListingTypelocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickSeniorCommunityListingType(){
		WebElement element = driver.findElement(ClickSeniorCommunityListingTypelocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickCorporateGousingListingType(){
		WebElement element = driver.findElement(ClickCorporateGousingListingTypelocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage PropertyTypeDropDown(){
		WebElement element = driver.findElement(PropertyTypeDropDown);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage UpdateButtononProperptyDropDown(){
		WebElement element = driver.findElement(UpdateButtononProperptyDropDownLocator);	
		element.click();
		return new DetailPage(driver);
	}
	public DetailPage ClickAllPropertyType(){
		WebElement element = driver.findElement(ClickAllPropertyTypeLocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickresidentialPropertyType(){
		WebElement element = driver.findElement(ClickresidentialPropertyTypeLocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickTownHousePropertyType(){
		WebElement element = driver.findElement(ClickTownHousePropertyTypeLocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickCondominumPropertyType(){
		WebElement element = driver.findElement(ClickCondominumPropertyTypeLocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage ClickApartmentPropertyTypeType(){
		WebElement element = driver.findElement(ClickApartmentPropertyTypeLocator);	
		element.click();
		return new DetailPage(driver);
	}
	
	public DetailPage CloseMilitaryPopupwindow(){
		WebElement element = driver.findElement(CloseMilitaryPopupwindowLocator);	
		element.click();
		return new DetailPage(driver);
	}
	////////////////////////////////For Sale filter by Mayank////////////////////////////////////////////////////
	public DetailPage ClicklistingdropdownonSalepage(){
		WebElement element = driver.findElement(ClicklistingdropdownonSalePageLocator);	
		element.click();
		return new DetailPage(driver);
	}
	public DetailPage UncheckListingTypeOnSalepage(String arg2) throws InterruptedException
	{
	System.out.println("Value on function"+arg2);	
	WebElement element = driver.findElement(By.xpath("//input[@value='"+arg2+"']"));
	element.click();
	return new DetailPage(driver);
	}
	
	public DetailPage ClickPropertyTypeOnSalepage(String arg2) throws InterruptedException
	{
	System.out.println("Value on function"+arg2);	
	WebElement element = driver.findElement(By.xpath("//input[@value='"+arg2+"']"));
	element.click();
	return new DetailPage(driver);
	}
	/*public DetailPage ClickUpdateButtonObListingTypeonSalePage(){
		WebElement element = driver.findElement(ClickUpdateButtonOnListingTypeonSalePage);	
		element.click();
		return new DetailPage(driver);
	}*/
	
}

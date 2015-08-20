package HDC.cucumber.MavenCucumberPrototype1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;



import HDC.cucumber.pageobject.DetailPage;
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

public class Steps {
	
	WebDriver driver = null;
	HomePagePortal homePagePortal;
	SearchPage searchPage;
	DetailPage detailPage;
	
	/*
	WebDriver driver = getDriver();
	HomePagePortal homePagePortal = getHomePagePorta();
	SearchPage searchPage = getSearchPage();
	DetailPage detailPage;
	*/
	
	@Before
	public void testSetUp(){
		driver = new FirefoxDriver();
		//driver = new PhantomJSDriver();
		//driver = new ChromeDriver();
		
		System.out.println("Created new driver Object in the test Set Up = "+driver);
	}
	

	@After
	public void ShutDown(Scenario scenario){
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }

        	System.out.println("Before Closing the driver in the test Set Up = "+driver);   	
            driver.close();
            System.out.println("CLosed driver");
            System.out.println("After Closing the getdriver in the test Set Up = "+driver);

    }		
	
	
	//////////////////////////////////// Home Page StepDefinition //////////////////////////////////////
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

	
	@And("^I select For Rent$")
	public void SelectForRent() throws Throwable{
		homePagePortal.clickSearchDropDown();
		homePagePortal.SelectForRent();
	}
	
	@When("^I click the search button$")
	public void ClickTheSearchButton() throws Throwable {
		//driver.findElement(By.cssSelector(".media>input")).click();
		searchPage = homePagePortal.clickSearchButton();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	
	
////////////////////////////////////Search Page Step Definition //////////////////////////////////////
	
	@Then("^I check the title contains \"([^\"]*)\"$")
	public void CheckTitle(String title) throws Throwable {
		Thread.sleep(3000);
		
		System.out.println("The Expected Title to include:"+title);
		System.out.println("The Actual H1 is             :"+searchPage.getPageTitle());
		  
		Assert.assertTrue("Failed: Wrong Title", searchPage.getPageTitle().contains(title));		
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
		
		Assert.assertTrue("Failed: Wrong Header", searchPage.getHeader().equals(header));			    
	}
	
	@Then("^I should see \"([^\"]*)\" in the school SRP header$")
	public void I_should_see_the_school_header(String header) throws Throwable {
		Thread.sleep(3000);
	  	
		System.out.println("The Expected H1 is :"+ header);
		System.out.println("The Actual H1 is   :"+ searchPage.getSchoolHeader());
		
		Assert.assertTrue("Failed: Wrong Header", searchPage.getSchoolHeader().equals(header));
	}
	
	@Then("^I click the Request Info Button$")
	public void ClickRequestInfoButton() throws Throwable {
		Thread.sleep(3000);
		searchPage.clickRequestButton();
		System.out.println("Clicked the Request Info button on the first listing on the SRP");	
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	@Then("^I click the Request Info Button on FRC SRP$")
	public void ClickCheckAvailability() throws Throwable {
		Thread.sleep(3000);
		searchPage.clickCheckAvailability();
		System.out.println("Clicked the Request Info button on the first listing on the SRP");	
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	@And ("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field on the SRP$") 
	public void PopulateTargetFieldOnSRP(String value, String target ) throws InterruptedException{
		Thread.sleep(3000);
		searchPage.PopulateFieldSRP(value, target);
		System.out.println("Populated "+target+" Field with:"+ value);	
	}
	
	@Then ("^I see the Agent Contact Form$") 
	public void IsAgentCardVisible() throws Throwable{
		searchPage.IsAgentCardPresent();
		 Assert.assertTrue("No Lead Form", searchPage.IsAgentCardPresent());
		 System.out.println("Is Lead Form Displayed: "+searchPage.IsAgentCardPresent());		
	}
	
	@When("^I deselect the Improve Your Credit Score checkbox$")
	public void deselectCreditScorecheckbox() throws Throwable {
		searchPage.ClickImproveCreditButton();
		System.out.println("Deselected the Credit Card Checkbox");
		
	}

	@When("^I click the send button from the agent card$")
	public void clickSendButtonFromAgentCard() throws Throwable {
		searchPage.ClickSendButton();
		System.out.println("Clicked the send button from the agent card");
	}
	
	@When("^I click the send button from the agent card on SPR for FRC$")
	public void clickSendButtonFromAgentCardFRC() throws Throwable {
		searchPage.ClickSendButtonFRC();
		System.out.println("Clicked the send button from the agent card");
		
	}
	
	//SRP Assertions
	@Then("^I should see the myHomes Overlay Agent Card as a confirmation form$")
	public void isConfirmationFormPresent() throws Throwable {
		searchPage.IsConfirmationFormPresent();
		Assert.assertTrue("No Confirmation Form", searchPage.IsConfirmationFormPresent());
		System.out.println("Is Confirmation Form Displayed: "+searchPage.IsConfirmationFormPresent());
	}
	
	@And("^I uncheck the get prequalified box on SRP$")
	public void UncheckPrequalifiedBoxON_SRP() throws Throwable {
		searchPage.UncheckPrequalifyButton();
		System.out.println("Unchecked Prequalify Button");   
	}


	@Then("^I should see \"([^\"]*)\" in the srp lead confirmation form$")
	public void I_should_see_in_the_srp_lead_confirmation_form(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		try{
			Assert.assertTrue("Message did not match anything in the form", searchPage.leadConfirmationForm().contains(arg1));
			System.out.println(arg1 + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(arg1 + " - failed");
	          throw e;
	       }   
	}
	
	@Then("^I should see the local connect form$")
	public void isLocalConnectFormPresent() throws Throwable {	
		Thread.sleep(3000);
		Assert.assertTrue("No Credit Repair Form", searchPage.isLocalConnectFormPresent());
		System.out.println("Is Confirmation Form Displayed: "+searchPage.isLocalConnectFormPresent());    
	}
	
	@Then("^I should see the mortgage form on SRP$")
	public void isMortgageFormPresent_SRP() throws Throwable {	
		Thread.sleep(3000);
		Assert.assertTrue("No Credit Repair Form", searchPage.isLocalConnectFormPresent());
		System.out.println("Is Confirmation Form Displayed: "+searchPage.isLocalConnectFormPresent());    
	}
	
	@Then("^I should see the confirmatio form on SRP$")
	public void isCOnfirmationFormPresent_SRP() throws Throwable {	
		Thread.sleep(3000);
		Assert.assertTrue("No Credit Repair Form", searchPage.isLocalConnectFormPresent());
		System.out.println("Is Confirmation Form Displayed: "+searchPage.isLocalConnectFormPresent());    
	}
	
	@Then("^I should see \"([^\"]*)\" in the SRP confirmation form$")
	public void ConfirmationFormOn_SRP(String Message) throws Throwable {
		try{
			Assert.assertTrue("Message did not match anything in the form", searchPage.LocalConnectConfirmation().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }    
	}
	
////////////////////////////////////Common Step Definition //////////////////////////////////////
	
	@Then("^I close the browser$")
	public void CloseTheBrowser() throws Throwable {
	    driver.close();
	    System.out.println("CLosed Driver.  ");
	    System.out.println("Driver Value: "+driver);
	}
	
	
//////////////////////////////////// UDP Step Definition ////////////////////////////////////////	
	@And ("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$") 
	public void PopulateTargetField(String value, String target ){
		detailPage.PopulateField(value, target);
		System.out.println("Populated "+target+" Field with: "+value);	
	}
	
	@And ("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field in the FRC card$") 
	public void PopulateTargetField_FRC_Card(String value, String target ){
		detailPage.PopulateField_FRC_Card(value, target);
		System.out.println("Populated "+target+" Field");	
	}
	

	@And("^I uncheck the get prequalified box$")
	public void UncheckPrequalifiedBox() throws Throwable {
		detailPage.UncheckPrequalifyButton();
		System.out.println("Unchecked Prequalify Button");   
	}
	
	@When("^I uncheck the improve your credit score box$")
	public void UncheckCreditRepairCheckBox() throws Throwable {
	    detailPage.UncheckCreditRepairCheckBox();
	    System.out.println("Unchecked Credit Repair Button");  
	}
	
	@When("^I uncheck the improve your credit score box on the for rent card$")
	public void UncheckCreditRepairCheckBoxOnForRentCard() throws Throwable {
	    detailPage.UnCheckImproveCreditScoreBox();
	    System.out.println("Unchecked Credit Repair Button");  
	}
	
	@And("^I click the Send button$")
	public void SubmitForm() throws Throwable {
	
		detailPage.ClickSubmitButton();
		System.out.println("Submitted Form");  			
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);		
	}
	
	@Then("^I should see the Progrexion Form$")
	public void isCreditRepairFormPresent() throws Throwable {
		detailPage.ProgrexionForm();
		Assert.assertTrue("No Credit Repair Form", detailPage.ProgrexionForm());
		System.out.println("Is Confirmation Form Displayed: "+detailPage.ProgrexionForm());    
	}
	
	@When("^I click the Request Info Button on sticky header$")
	public void ClickStickyHeader() throws Throwable {
		detailPage.ClickStickyHeader();
	}
	
	@Then("^I see the Agent Contact Form from sticky header$")
	public void isStickyAgentFormPresent() throws Throwable {
		
		boolean status = detailPage.IsStickyAgentCardPresent();
		Assert.assertTrue("No Credit Repair Form", status);
		System.out.println("Is Lead Form Displayed: "+status);     
	}
	
	
	@Then("^I enter \"([^\"]*)\" in the sticky header form name field$")
	public void sticky_header_name_form_field(String value) throws Throwable {
		Thread.sleep(3000);
		detailPage.PopulateStickyNameField(value);
		System.out.println("Populated the name Field with "+value );
	}
	
	@Then("^I enter \"([^\"]*)\" in the sticky header form email field$")
	public void sticky_header_email_form_field(String value) throws Throwable {
		Thread.sleep(3000);
		detailPage.PopulateStickyEmailField(value);
		System.out.println("Populated the name Field with "+value );
	}
	
	
	@Then("^I enter \"([^\"]*)\" in the sticky header form phone field$")
	public void sticky_header_phone_form_field(String value) throws Throwable {
		Thread.sleep(3000);
		detailPage.PopulateStickyPhoneField(value);
		System.out.println("Populated the name Field with "+value );
	}
	
	@And("^I click the sticky header form submit button$")
	public void StickyHeaderSubmit(){
		detailPage.ClickStickyHeaderSubmitButton();
		System.out.println("Clicked Submit Button in the Sticky header");
	}
	
	@Then("^I should see the Progrexion Form from sticky header$")
	public void isStickyCreditRepairFormPresent() throws Throwable {		
		Assert.assertTrue("No Credit Repair Form", detailPage.StickyProgrexionForm());
		System.out.println("Is Confirmation Form Displayed: "+detailPage.StickyProgrexionForm());    
	}
	
	@Then("^I should see the Lead Confirmation from sticky header$")
	public void isStickyConfirmFormPresent() throws Throwable {	
		Thread.sleep(3000);
		Assert.assertTrue("No Credit Repair Form", detailPage.StickyProgrexionForm());
		System.out.println("Is Confirmation Form Displayed: "+detailPage.StickyProgrexionForm());    
	}
	
	@Then("^I should see the form$")
	public void isMortgageFormPresent() throws Throwable {	
		Thread.sleep(3000);
		Assert.assertTrue("No Credit Repair Form", detailPage.StickyProgrexionForm());
		System.out.println("Is Confirmation Form Displayed: "+detailPage.StickyProgrexionForm());    
	}
	
	@When("^I uncheck the improve your credit score box on the stikcy header from$")
	public void UncheckStickyCreditRepairCheckBox() throws Throwable {
	    detailPage.UncheckStickyCreditRepairButton();
	    System.out.println("Unchecked Credit Repair Button from Sticky header");  
	}
	
	@And("^I click check availability button on the frc listing$")
	public void ClickCheckAvailabilityButtonOnFRC() throws Throwable {
		detailPage.ClickCheckAvailabilityOnFRC();
		Thread.sleep(3000);
		 System.out.println("Clicked the Check Availability Button");
	}
	
	@And("^I click the send button from the for rent card$")
	public void ClickSendButtonOnForRentCard() throws Throwable {
		detailPage.ClickSendButtonFRC_Card();
		Thread.sleep(3000);
		 System.out.println("Clicked the Check Availability Button");
	}
	
	@Given("^I should see the Lead Confirmation on SRP$")
	public void AssertConfirmationFormSRP() throws Throwable {		
		searchPage.Confirmation();    
	    Assert.assertTrue("No Confirmation Form", searchPage.Confirmation());
	    System.out.println("Is Confirmation Form Displayed: "+searchPage.Confirmation()); 
	}
	
	
	@Then("^I should see \"([^\"]*)\" in the progrexion confirmation form the sticky header$")
	public void isTextPresentIsProfrexionForm(String Message) throws Throwable {
		Thread.sleep(3000);
		try{
			Assert.assertTrue("Message did not match anything in the form", detailPage.StickyForRentProgressionConfirmation().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }  
	    
	}
	
	
	////////////////// School Module /////////////////
	@Then("^I should see \"([^\"]*)\" in the shcool module$")
	public void isTextPresentIsSchoolModule(String Message) throws Throwable {
		Thread.sleep(3000);
		try{
			Assert.assertTrue("Text not available in School Module", detailPage.LocalSchoolsModuleText().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }  
	    
	}
	
	@Then("^I should see \"([^\"]*)\" in the shcool module on FRC page$")
	public void isTextPresentIsSchoolModuleFR(String Message) throws Throwable {
		Thread.sleep(3000);
		try{
			Assert.assertTrue("Text not available in School Module", detailPage.LocalSchoolsModuleTextFR().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }  
	    
	}
	
	@Then("^I should see \"([^\"]*)\" as a text in the tooltip$")
	public void I_should_see_as_a_text_in_the_tooltip(String text) throws Throwable {
		Thread.sleep(3000);
		try{
			Assert.assertTrue("Text not available in School Module", detailPage.LocalSchoolsToolTipText().contains(text));
			System.out.println(text + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(text + " - failed");
	          throw e;
	       }  
    
	}
	
	@Then("^I should see \"([^\"]*)\" as a text in the tooltip FR$")
	public void I_should_see_as_a_text_in_the_tooltip_FR(String text) throws Throwable {
		Thread.sleep(3000);
		try{
			Assert.assertTrue("Text not available in School Module", detailPage.LocalSchoolsToolTipTextFR().contains(text));
			System.out.println(text + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(text + " - failed");
	          throw e;
	       }  
    
	}
	
	@Then("^I click the View More Schools Nearby link$")
	public void I_click_the_View_More_Schools_Nearby_link_FS() throws Throwable {
		
		searchPage = detailPage.ClickViewMoreSchoolsLink();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		System.out.println("Clicked the more schools link" );
	}
	
////////////////////////////////////For Sale and For Rent Confirmation Forms //////////////////////////////////////
	@Given("^I should see the Lead Confirmation$")
	public void AssertConfirmationForm() throws Throwable {		
		detailPage.Confirmation();    
	    Assert.assertTrue("No Confirmation Form", detailPage.Confirmation());
	    System.out.println("Is Confirmation Form Displayed: "+detailPage.Confirmation()); 
	}
	
	@Then("^I should see \"([^\"]*)\" in the confirmation form$" )
	public void ConfirmationMessage(String Message) throws Throwable {
		System.out.println("ConfirmationMessage Assertion: "+ detailPage.ThankYouMessage());
		
		Assert.assertTrue("No Confirmation Message", detailPage.ThankYouMessage().equals(Message));
		System.out.println("Is Confirmation Message Displayed: "+detailPage.ThankYouMessage().equals(Message));	
	}
	
	@Then("^I should see \"([^\"]*)\" in the normal confirmation form$")
	public void ForRentNormalConfirmation(String Message) throws Throwable {
		try{
			Assert.assertTrue("Message did not match anything in the form", detailPage.ForRentProgressionConfirmation().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }    
	}
	

////////////////////////////////////Mortgage Form //////////////////////////////////////		
	@Then("^I select \"([^\"]*)\" from the \"([^\"]*)\" dropdown$")
	public void SelectCreditScore(String arg1, String arg2 ){
		detailPage.SelectDropdown(arg1, arg2);
		System.out.println("Selected "+arg1+" from the "+arg2+" dropdown");		
	}
	
	
	@Then("^I select \"([^\"]*)\" from the downPayment dropdown$")
	public void SelectDownPaymentDropdown(String arg1) throws Throwable {
	    detailPage.SelectDownPaymentDropdown(arg1);
	    System.out.println("Selected "+arg1);	    
	}
	
	@And ("^I click the Get Prequalified button$")
	public void ClickGetPreqButton(){
		detailPage.ClickPrequalityButton();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	@And ("^I click the Get Prequalified button on SRP$")
	public void ClickGetPreqButtonOnSRP(){
		searchPage.ClickPrequalifyButton();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	
	@Then("^I select \"([^\"]*)\" from the \"([^\"]*)\" dropdown on SRP$")
	public void SelectCreditScoreSRP(String arg1, String arg2 ){
		searchPage.SelectDropdown(arg1, arg2);
		System.out.println("Selected "+arg1+" from the "+arg2+" dropdown");		
	}
	
	@Then("^I select \"([^\"]*)\" from the downPayment dropdown on SRP$")
	public void SelectDownPaymentDropdownSRP(String arg1) throws Throwable {
		searchPage.SelectDownPaymentDropdown(arg1);
	    System.out.println("Selected "+arg1);	    
	}
	
////////////////////////////////////Mortgage Form Mayank Purohit //////////////////////////////////////	
	
	@When("^I enter \"([^\"]*)\" in the loan amount field$")
	public void PopulateLoanAmount (String value) throws Throwable {
		
		detailPage= new DetailPage(driver);
		detailPage.PopulateLoanAmountValue(value);
	}

	@And ("^I select \"([^\"]*)\" from the downpayment dropdown$") 
	public void DownPayementDrop(String Name){
		
		detailPage= new DetailPage(driver);
		detailPage.DownPayementDropDown(Name);
		//System.out.println("Populated Phone Field");	
	}
	
	@And ("^I select \"([^\"]*)\" from the credit rating dropdown$") 
	public void CreditDrop(String Name){
			
		detailPage= new DetailPage(driver);
		detailPage.CreditCardDropDown(Name);
			
	}
	
	@And("^I enter \"([^\"]*)\" in the city field$")
	public void EnterCity(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		
		detailPage= new DetailPage(driver);
		detailPage.Entercityname(value);
		
	}

	@And ("^I select \"([^\"]*)\" from the state dropdown$") 
	public void StateDrop(String Name){
			
		detailPage= new DetailPage(driver);
		detailPage.StateDropDown(Name);
	}
	@And("^I enter \"([^\"]*)\" in the first name field$")
	public void EnterFirstName(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		
		detailPage= new DetailPage(driver);
		detailPage.firstname(value);
	}
	
	@And("^I enter \"([^\"]*)\" in the last name field$")
	public void EnterLastName(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		
		
		detailPage= new DetailPage(driver);
		detailPage.lastname(value);
	}
	@And("^I enter \"([^\"]*)\" in the phone field on the mortgage page$")
	public void EnterPhoneName(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		
		detailPage= new DetailPage(driver);
		detailPage.PhonefieldMortagePage(value);
		//detailPage.PopulateLoanAmountValue(value);
	}
	@And("^I enter \"([^\"]*)\" in the email field on the mortgage page$")
	public void EnterEmailName(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		
		detailPage= new DetailPage(driver);
		detailPage.EmailfieldMortagePage(value);
	}
	
	@And("^I click the get grequalified button$")
	public void PrequalifiedButton() throws Throwable {
		
		detailPage= new DetailPage(driver);
		detailPage.PrequalifiedButtonMortagePage();
	}
	@Then("^I should see \"([^\"]*)\" on mortage page$")
	public void MatchMortagePage(String Message) throws Throwable {
			if(driver.getPageSource().contains(Message))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
	}
	@And ("^I select \"([^\"]*)\" from the bankruptcy History dropdown1$") 
	public void Bankrup(String Name){
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);

		detailPage= new DetailPage(driver);
		detailPage.SelectBankruptcyOption(Name);
		//System.out.println("Populated Phone Field");	
	}
	//-----------------------------------Request refi---------------------------------------------
	

	@And("^I enter \"([^\"]*)\" in Estimated Property Value field$")
	public void EstimatePropertyValue(String value) throws Throwable {
		
		
		detailPage= new DetailPage(driver);
		detailPage.EstimatePropertyValuefield(value);
		//detailPage.PopulateLoanAmountValue(value);
	}
	@And("^I click the Submit Request button$")
	public void ClickSubmitRequest() throws Throwable {
		
	
		detailPage= new DetailPage(driver);
		detailPage.ClickSubmitRequestonRefiRequest();
		//return new DetailPage(driver);
	}
	@Then("^I should see \"([^\"]*)\" in the new page$")
	public void RefiRequestNewPage(String Message) throws Throwable {
		//System.out.println("Message------------");
			if(driver.getPageSource().contains(Message))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
	}
	@Then("^I should see \"([^\"]*)\" on refi request page$")
	//Thread.sleep(5000);
	public void MatchRefiRequest(String Message) throws Throwable {
		//System.out.println("--------------Message------------");
			if(driver.getPageSource().contains(Message))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
	}
	//-------------------------Request-------------Home-------------Estimate--------------------------
	
	@And("^I enter \"([^\"]*)\" in the address field$")
	public void RequestHomeEstimateAddress(String value) throws Throwable {
		System.out.println("Searched City: "+value);
		detailPage= new DetailPage(driver);
		detailPage.EnterStreetAddressonMortage(value);
		//System.out.println("Populated Email Field");
		
	}
	
	@And("^I enter \"([^\"]*)\" in the zip field$")
	public void RequestHomeZip(String value) throws Throwable {
		System.out.println("Searched City: "+value);
			detailPage= new DetailPage(driver);
		  	detailPage.RequestHomeZipField(value);
	    
	}
	
	@And("^I click the submitCMARequestFormButton$")
	public void submitCMARequestFormButton() throws Throwable {
				detailPage= new DetailPage(driver);
	  	detailPage.submitCMARequestForm();
	}
	@Then("^I should see \"([^\"]*)\" on home estimate$")
	//Thread.sleep(5000);
	public void MatchHomeEstimate(String Message) throws Throwable {
		//System.out.println("--------------Message------------");
			if(driver.getPageSource().contains(Message))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
	}

	
////////////////////////////////////Mortgage Form Mayank Purohit //////////////////////////////////////	
	
////////////////////////////////////Credit Repair Form //////////////////////////////////////
	
	@Then("^I should see \"([^\"]*)\" in the progrexion confirmation form$")
	public void ForRentCOnfirmation(String Message) throws Throwable {
		try{
			Assert.assertTrue("Message did not match anything in the form", detailPage.ForRentProgressionConfirmation().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }    
	}
	
	@And("^I click the Get FREE Credit Repair Consultation button$")
	public void ClickGetFreeFreeCreditRepairButton() throws Throwable {
		detailPage.ClickCreditRepairButton();
		System.out.println("Submitted Form");  		
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);	
	}
	
	
	@Then("^I should see \"([^\"]*)\" in the progrexion confirmation form on SRP$")
	public void ForRentCOnfirmationSRP(String Message) throws Throwable {
		try{
			Assert.assertTrue("Message did not match anything in the form", searchPage.ForRentProgressionConfirmation().contains(Message));
			System.out.println(Message + " - passed");
			
		}catch(AssertionError e){
	          System.out.println(Message + " - failed");
	          throw e;
	       }    
	}
	
	@And("^I click the Get FREE Credit Repair Consultation button on SRP$")
	public void ClickGetFreeFreeCreditRepairButtonSRP() throws Throwable {
		searchPage.ClickCreditRepairButton();
		System.out.println("Submitted Form");  		
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);	
	}
	
	

	
	////////////////////////////////     URLS    //////////////////////////////	
////////////////////////////////////For Rent & FRC UDP and SRP URLs //////////////////////////////////////
	
	@Given("I am on a For Rent details page$")
	public void NavigateToFoRentUDP() throws Throwable {
	detailPage = new DetailPage(driver);
	detailPage.NavigateToFoRentUDP();
	System.out.println("Executed For Rent UDP navigation");
	}
	
	@Given("I am on a For Sale details page$")
	public void NavigateToForSaleUDP() throws Throwable {
	detailPage = new DetailPage(driver);
	detailPage.NavigateToForSaleUDP();
	System.out.println("Executed For Sale UDP navigation");
	}
	
	@Given("I am on a For Sale Search Results Page$")
	public void NavigateToForSaleSRP() throws Throwable {
	searchPage = new SearchPage(driver);
	searchPage.NavigateToForSaleSRP();
	System.out.println("Executed For Rent UDP navigation");
	}
	
	@Given("^I am on a For Rent Search Results Page$")
	public void NavigateToFoRentUSRP() throws Throwable {
	searchPage = new SearchPage(driver);
	searchPage.NavigateToFoRentSRP(); 
	
	System.out.println("Executed For Rent SRP navigation");
	}
	
	@Given("^I am on a FRC Search Results Page$")
	public void NavigateToFRC_SRP() throws Throwable {
	searchPage = new SearchPage(driver);
	searchPage.NavigateToFRC_SRP(); 
	
	System.out.println("Executed FRC SRP navigation");
	}
	
	
	@Given("I am on an FRC details page$")
	public void NavigateToFRC_UDP() throws Throwable {
	detailPage = new DetailPage(driver);
	detailPage.NavigateToFRC_UDP();
	
	System.out.println("Executed For Rent UDP navigation");
	
	}
	
	
	
////////////////////////////////////Builders UDP URL //////////////////////////////////////
	
	@Given("I am on a builders listing$")
	public void NavigateToBuilderUDP() throws Throwable {
	detailPage = new DetailPage(driver);
	detailPage.NavigateToBuilderUDP();
	
	//detailPage.navigateToBuilderUDP();
	System.out.println("Executed Builder UDP navigation");
	}
	



///////////////////////////////////Mortgage Pages URL /////////////////////////////////////
//private static final String Value = null;
@Given("^I am on the Mortgage Request Connect page$")
public void NavigateToHomePage1() throws Throwable {
    //driver.get("http://homes.com");
	homePagePortal = new HomePagePortal(driver);
	homePagePortal.MortageRequestConnectPage();
    System.out.println("Mortage Executed navigation");	    
}

@Given("^I am on the Refinance Request page$")
public void NavigateToMortgage() throws Throwable {
    //driver.get("http://homes.com");
	homePagePortal = new HomePagePortal(driver);
	homePagePortal.MortageRefiRequestPage();
	//Thread.sleep(500000);
    System.out.println("Mortage Executed navigation");	    
}

@Given("^I am on the Request Home Estimate page$")
public void NavigateToRequestHomeEstimate() throws Throwable {
    //driver.get("http://homes.com");
	homePagePortal = new HomePagePortal(driver);
	homePagePortal.MortageRequestHomeEstimate();
	//Thread.sleep(500000);
    System.out.println("Mortage Executed navigation");	    
}


///////////////////////////////////Mortgage Pages functions  URL completed /////////////////////////////////////
}

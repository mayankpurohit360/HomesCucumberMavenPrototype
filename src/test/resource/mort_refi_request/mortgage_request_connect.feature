@portal @regression @mortgage @mortage1
Feature: Submitting Mortage Lead from the Mortgage Request Connect page
	As a user
	I want to submit a mortgage lead
	So I can get a mortgage

	Background: I am on the Mortgage Request page
		Given I am on the Mortgage Request Connect page
		#http://www.homes.com/Content/MortgageRequestConnect.cfm/

	Scenario: Submitting Mortage Lead with all required information
		When I enter "500" in the loan amount field
		And I select "10%" from the downpayment dropdown
		And I select "Average 640 - 679" from the credit rating dropdown
		And I select "Yes, in last 2 years" from the bankruptcy History dropdown1
		And I enter "Your Hometown" in the city field
		And I select "Florida" from the state dropdown
		And I enter "Test" in the first name field
		And I enter "Lead" in the last name field
		And I enter "1234567890" in the phone field on the mortgage page
		And I enter "Mort_Request@regression.test" in the email field on the mortgage page
		And I click the get grequalified button
		Then I should see "Message Sent!" in the new page
		Then I should see "Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:" in the new page
		
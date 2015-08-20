@portal @regression @mortgage @mortgage2
Feature: Submitting Refinance Lead from Refinance Request page
	As a user
	I want to submit a Refinance Request
	So I can refinance my mortgage

	Background: I am on the Refinance Request page
		Given I am on the Refinance Request page
		#http://www.homes.com/Content/RefiRequest.cfm

	Scenario: Submitting Mortage Lead with all required information
		When I select "Average 640 - 679" from the credit rating dropdown
		And I select "Yes, in last 2 years" from the bankruptcy History dropdown1
		And I enter "700" in the loan amount field
		And I enter "Your Hometown" in the city field
		And I select "Florida" from the state dropdown
		And I enter "Test" in the first name field
		And I enter "Lead" in the last name field
		And I enter "1234567890" in the phone field on the mortgage page
		And I enter "Refi_Request@regression.test" in the email field on the mortgage page
		And I enter "100" in Estimated Property Value field
		And I click the Submit Request button
		Then I should see "Message Sent!" in the new page
		Then I should see "Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:" on refi request page
		

	
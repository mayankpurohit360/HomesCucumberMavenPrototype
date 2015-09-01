@portal @regression @mortgage @mortgage1222
Feature: Submitting Mortage Lead from the Mortgage Request Connect page
	As a user
	I want to submit a mortgage lead
	So I can get a mortgage
 with you shortly. Now that your information has been sent, where would you like to go:" in the new page
		
 Background: I am on the Mortgage Request page
    Given I am on the Mortgage Request Connect page

  Scenario: Submitting Mortage Lead with all required information
    When I enter "500" in the "loanAmount" field on the Mortgage Request page
    And I select "10%" from the "downpayment" dropdown in the request page
    And I select "Average 640 - 679" from the "score" dropdown in the request page
    And I select "Yes, in last 2 years" from the "bankruptcyHistory" dropdown in the request page
    And I enter "Your Hometown" in the "city" field on the Mortgage Request page
    And I select "Florida" from the "state" dropdown in the request page
    And I enter "Test" in the "first" field on the Mortgage Request page
    And I enter "Lead" in the "last" field on the Mortgage Request page
    And I enter "1234567890" in the "phone" field on the Mortgage Request page
    And I enter "Mort_Request@regression.test" in the "email" field on the Mortgage Request page
    And I click the get grequalified button from the Mortgage Request Connect page
    Then I should see "Message Sent!" in the new page
    And I should see "Thanks for submitting your information." in the new page
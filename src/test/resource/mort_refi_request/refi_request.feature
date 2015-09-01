@portal @regression @mortgage @mortgage2122
Feature: Submitting Refinance Lead from Refinance Request page
	As a user
	I want to submit a Refinance Request
	So I can refinance my mortgage


	 Background: I am on the Refinance Request page
    Given I am on the Refinance Request page

  Scenario: Submitting Mortage Lead with all required information
    When I select "Average 640 - 679" from the "score" dropdown in the request page
    And I select "Yes, in last 2 years" from the "bankruptcyHistory" dropdown in the request page
    And I enter "200" in the "loanAmount" field on the Mortgage Request page
    And I enter "500" in the "est_prop_val" field on the Mortgage Request page
    And I select "Florida" from the "state" dropdown in the request page
    And I enter "Your Hometown" in the "city" field on the Mortgage Request page
    And I enter "Test" in the "first" field on the Mortgage Request page
    And I enter "Lead" in the "last" field on the Mortgage Request page
    And I enter "1234567890" in the "phone" field on the Mortgage Request page
    And I enter "Refi_Request@regression.test" in the "email" field on the Mortgage Request page
    And I click the Submit Request button from the Refinance Request Page
    Then I should see "Message Sent!" in the new page
    And I should see "Thanks for submitting your information." in the new page
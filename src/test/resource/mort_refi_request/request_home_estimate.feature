@portal @regression @mortgage3122 @mortgage
Feature: Submitting Request Home Estimate Lead 
	As a user
	I want to submit a Request Home Estimate
	So I can get a Home Estimate


  Background: I am on the Request Home Estimate page
    Given I am on the Request Home Estimate page

  Scenario: Submitting Request Home Estimate Form
    When I enter "150 Main Street" in the "streetAddress" field on the Home Value Estimate form
    And I enter "Your Hometown" in the "city" field on the Home Value Estimate form
    And I enter "33333" in the "zip" field on the Home Value Estimate form
    And I select "Florida" from the "state" dropdown in the request page  
    And I enter "Test" in the "first" field on the Home Value Estimate form
    And I enter "Lead" in the "last" field on the Home Value Estimate form
    And I enter "1234567890" in the "phone" field on the Home Value Estimate form
    And I enter "Request_Home_Estimate@regression.test" in the "email" field on the Home Value Estimate form
    And I click the submitCMARequestFormButton
    Then I should see "Your request has been sent" in the new page
    And I should see "Thank you for completing the free home market analysis." in the new page
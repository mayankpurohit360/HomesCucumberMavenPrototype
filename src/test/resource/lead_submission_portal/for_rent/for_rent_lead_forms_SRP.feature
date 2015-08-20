@completed @regression @portal @forrentsrp
Feature: Submitting Check Availability Lead a for rent SEARCH page
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Background: I am on a For Rent search results Page
    Given I am on a For Rent Search Results Page

  Scenario: Submitting A For Rent Request Info Property Lead
    When I click the Request Info Button
    And I see the Agent Contact Form
    And I enter "Test Lead" in the "name" field on the SRP
    And I enter "test@regr.com" in the "email" field on the SRP
    And I enter "1234567890" in the "phone" field on the SRP
    And I click the send button from the agent card
    Then I should see "Thank you for your interest in this property" in the progrexion confirmation form on SRP
    And I should see "Do You Want To Increase Your Chances of Getting Approved?" in the progrexion confirmation form on SRP
    And I should see "Improving your credit may help you qualify for a lease or mortgage." in the progrexion confirmation form on SRP
    And I should see "Better credit may lower your cost of renting or buying a home." in the progrexion confirmation form on SRP
    And I should see "Increase your negotiation power." in the progrexion confirmation form on SRP
    And I should see "call 866-324-8867" in the progrexion confirmation form on SRP
    And I should see "Get a FREE Credit Repair Consultation" in the progrexion confirmation form on SRP
    And I should see "Not At This Time" in the progrexion confirmation form on SRP
    And I click the Get FREE Credit Repair Consultation button on SRP
    Then I should see the myHomes Overlay Agent Card as a confirmation form
    Then I should see "Thank you for your interest in this property" in the srp lead confirmation form
    Then I should see "Save Property" in the srp lead confirmation form

  Scenario Outline: Submitting A For Rent Request Info Property Lead unchecking
    When I click the Request Info Button
    And I see the Agent Contact Form
    And I enter "<Name>" in the "name" field on the SRP
    And I enter "test@regr.com" in the "email" field on the SRP
    And I enter "1234567890" in the "phone" field on the SRP
    And I deselect the Improve Your Credit Score checkbox
    And I click the send button from the agent card
    Then I should see the myHomes Overlay Agent Card as a confirmation form
    Then I should see "Thank you for your interest in this property" in the srp lead confirmation form
    Then I should see "Save Property" in the srp lead confirmation form

    Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |

@completed @regression @forrent @stickyheader @no
Feature: Submitting For Rent lead on UDP
  As a user
  I want to contact a listing agent by submitting the sticky Header Form
  So they can give me a tour

  Background: I am on a For Rent details page
    Given I am on a For Rent details page
    When I click the Request Info Button on sticky header
    Then I see the Agent Contact Form from sticky header

  Scenario: Submitting A For Rent Request Info Property Lead form from sticky header
    And I enter "Test Lead" in the sticky header form name field
    And I enter "FS_SRP_Sticky_H1@regression.com" in the sticky header form email field
    And I enter "1234567890" in the sticky header form phone field
    And I click the sticky header form submit button
    Then I should see the Progrexion Form from sticky header
    And I should see "Do You Want To Increase Your Chances of Getting Approved?" in the progrexion confirmation form the sticky header
    And I should see "Improving your credit may help you qualify for a lease or mortgage." in the progrexion confirmation form the sticky header
    And I should see "Better credit may lower your cost of renting or buying a home." in the progrexion confirmation form the sticky header
    And I should see "Increase your negotiation power." in the progrexion confirmation form the sticky header
    And I should see "call 866-324-8867" in the progrexion confirmation form the sticky header
    And I should see "Get a FREE Credit Repair Consultation" in the progrexion confirmation form the sticky header
    And I should see "Not At This Time" in the progrexion confirmation form the sticky header
    And I click the Get FREE Credit Repair Consultation button
    Then I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form

  Scenario Outline: Submitting A For Rent Request Info Property Lead form from Sticky header with checkbox unselected
    And I enter "<Name>" in the sticky header form name field
    And I enter "FS_SRP_Sticky_H2@regression.com" in the sticky header form email field
    And I enter "1234567890" in the sticky header form phone field
    And I uncheck the improve your credit score box on the stikcy header from
    And I click the sticky header form submit button
    Then I should see the Progrexion Form from sticky header
    Then I should see "NEXT STEPS:" in the progrexion confirmation form the sticky header
    Then I should see "Save Property" in the progrexion confirmation form the sticky header
    
       Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |

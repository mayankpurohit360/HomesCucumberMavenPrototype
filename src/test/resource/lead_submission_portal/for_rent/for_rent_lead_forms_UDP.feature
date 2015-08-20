@completed @portal @forRentUdp
Feature: Submitting Check Availability Lead from a For Rent details page
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Background: I am on a For Rent details page
    Given I am on a For Rent details page

  Scenario: Submitting A For Rent Request Info Property Lead and the Improve Your Credit Score Form
    When I enter "Test Lead" in the "name" field
    And I enter "FR_UDP_Mortgage@regression.test" in the "email" field
    And I enter "1234567890" in the "phone" field
    And I click the Send button
    Then I should see the Progrexion Form
    Then I should see "Thank you for your interest in this property" in the progrexion confirmation form
    And I should see "Do You Want To Increase Your Chances of Getting Approved?" in the progrexion confirmation form
    And I should see "Improving your credit may help you qualify for a lease or mortgage." in the progrexion confirmation form
    And I should see "Better credit may lower your cost of renting or buying a home." in the progrexion confirmation form
    And I should see "Increase your negotiation power." in the progrexion confirmation form
    And I should see "call 866-324-8867" in the progrexion confirmation form
    And I should see "Get a FREE Credit Repair Consultation" in the progrexion confirmation form
    And I should see "Not At This Time" in the progrexion confirmation form
    And I click the Get FREE Credit Repair Consultation button
    Then I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form

  Scenario Outline: Submitting A For Rent Request Info Property Lead Only
    When I enter "<Name>" in the "name" field
    And I enter "FR_Uncheck_UDP@regression.test" in the "email" field
    And I enter "1234567890" in the "phone" field
    And I uncheck the improve your credit score box
    And I click the Send button
    And I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form
    
    Examples: 
      | Name                     |
      | Test lead                |
      | Jean Claude Van Damme    |

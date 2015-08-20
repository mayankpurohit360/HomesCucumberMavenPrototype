@completed @regression @portal @forrent
Feature: Submitting Check Availability Lead from a FRC details page
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Background: I am on a FRC details page
    Given I am on an FRC details page
    And I click check availability button on the frc listing

  Scenario: Submitting A FRC Request Info Property Lead and the Improve Your Credit Score Form
    When I enter "Test Lead" in the "name" field in the FRC card
    And I enter "FRC_Credit_SRP@regression.test" in the "froverlay_email" field in the FRC card
    And I enter "1234567890" in the "phone" field in the FRC card
    And I click the send button from the for rent card
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

  Scenario Outline: Submitting A FRC Request Info Property Lead
    When I enter "<Name>" in the "name" field in the FRC card
    And I enter "FRC_Uncheck_SRP@regression.test" in the "froverlay_email" field in the FRC card
    And I enter "1234567890" in the "phone" field in the FRC card
    And I uncheck the improve your credit score box on the for rent card
    And I click the send button from the for rent card
    Then I should see the Lead Confirmation from sticky header
    Then I should see "NEXT STEPS:" in the progrexion confirmation form the sticky header
    Then I should see "Save Property" in the progrexion confirmation form the sticky header

    Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |

@completed @portal @regression @forsale
Feature: Submitting Property Lead and Mortgage Lead from a SEARCH page
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Background: I am on a Search Results Page
    Given I am on a For Sale Search Results Page
    When I click the Request Info Button
    And I should see the local connect form

  Scenario: Submitting A For Sale Request Info Property Lead and a Mortgage Lead From SRP
    And I enter "Test Lead" in the "name" field on the SRP
    And I enter "FS_SRP_M@regression.test" in the "email" field on the SRP
    And I enter "1234567890" in the "phone" field on the SRP
    And I click the send button from the agent card
    Then I should see the mortgage form on SRP
    And I select "Good 680 - 719" from the "creditscore" dropdown on SRP
    And I select "Yes, in last 2 years" from the "bankruptcyHistory" dropdown on SRP
    And I select "20%" from the downPayment dropdown on SRP
    And I click the Get Prequalified button on SRP
    Then I should see the Lead Confirmation on SRP
    Then I should see "NEXT STEPS:" in the SRP confirmation form
    And I should see "Save Property" in the SRP confirmation form

  Scenario Outline: Submitting A For Sale Request Info Property Lead Only (uncheck get prequalified) From SRP
    And I enter "<Name>" in the "name" field on the SRP
    And I enter "FS_SRP@regression.test" in the "email" field on the SRP
    And I enter "1234567890" in the "phone" field on the SRP
    And I uncheck the get prequalified box on SRP
    And I click the send button from the agent card
    Then I should see the confirmatio form on SRP

    Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |
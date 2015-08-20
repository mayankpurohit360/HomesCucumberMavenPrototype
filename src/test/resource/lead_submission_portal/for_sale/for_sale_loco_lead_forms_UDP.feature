@completed @portal @regression @forsale
Feature: Submitting Property Lead and Mortgage Lead from a DETAILS page
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Scenario: Submitting A For Sale Request Info Property Lead and a Mortgage Lead From UDP
    Given I am on a For Sale details page
    When I enter "Test Lead" in the "name" field
    And I enter "FS_Details_Mort@regression.test" in the "email" field
    And I enter "1234567890" in the "phone" field
    And I click the Send button
    Then I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form
    And I select "Good 680 - 719" from the "creditscore" dropdown
    And I select "Yes, in last 2 years" from the "bankruptcyHistory" dropdown
    And I select "20%" from the downPayment dropdown
    And I click the Get Prequalified button
    And I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form

  Scenario Outline: Submitting A For Sale Request Info Property Lead Only (uncheck get prequalified) From udp
    Given I am on a For Sale details page
    And I enter "<Name>" in the "name" field
    And I enter "FR_Details_Uncheck@regression.test" in the "email" field
    And I enter "1234567890" in the "phone" field
    And I uncheck the get prequalified box
    And I click the Send button
    Then I should see the Lead Confirmation
    And I should see "Thank you for your interest in this property." in the confirmation form

    Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |

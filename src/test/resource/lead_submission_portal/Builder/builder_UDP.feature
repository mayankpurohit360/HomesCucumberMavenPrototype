@completed
Feature: BUILDERS UDP - Submitting Property Lead and Mortgage Lead from a
  As a user
  I want to contact a listing agent
  So they can give me a tour

  Background: I am on a BUILDERS page
    Given I am on a builders listing

  Scenario: Submitting A BUILDERS Lead and a Mortgage Lead From builder UDP
    When I enter "Test Lead" in the "name" field
    And I enter "test@lead.com" in the "email" field
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

  Scenario Outline: Submitting A BUILDERS Lead (uncheck get prequalified)
    And I enter "<Name>" in the "name" field
    And I enter "test@lead.com" in the "email" field
    And I enter "1234567890" in the "phone" field
    And I uncheck the get prequalified box
    And I click the Send button
    And I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form

    Examples: 
      | Name                  |
      | Test lead             |
      | Jean Claude Van Damme |

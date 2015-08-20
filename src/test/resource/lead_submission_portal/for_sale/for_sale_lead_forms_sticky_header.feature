@completed @portal @regression @forsale @stickyheader @no
Feature: Submitting Property Lead from property details page
  As a user
  I want to contact a listing agent by submitting the sticky Header Form
  So they can give me a tour

  Background: I am on a For Sale details page
    Given I am on a For Sale details page
    When I click the Request Info Button on sticky header
    Then I should see the form

  Scenario Outline: Submitting A For Sale Request Info Property Lead form from sticky header
    And I enter "<Name>" in the sticky header form name field
    And I enter "FS_UDP_Sticky_H1@regression.com" in the sticky header form email field
    And I enter "1234567890" in the sticky header form phone field
    And I click the sticky header form submit button
    Then I should see the form
    And I select "Good 680 - 719" from the "creditscore" dropdown
    And I select "Yes, in last 2 years" from the "bankruptcyHistory" dropdown
    And I select "20%" from the downPayment dropdown
    And I click the Get Prequalified button
    And I should see the Lead Confirmation
    Then I should see "Thank you for your interest in this property." in the confirmation form

    Examples: 
      | Name                     |
      | Test lead                |
      | Neil Patrick Harris      |
      | Jean Claude Van Damme    |

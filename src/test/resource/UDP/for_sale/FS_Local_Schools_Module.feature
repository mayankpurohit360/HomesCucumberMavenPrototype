@completed @portal @UDP @schools @schoolsfs @modules
Feature: Seeing and interacting with the Local Schools Module on For Sale UDP
  As a user
  I want see the nearby schools

  Background: I am on a For Sale details page
    Given I am on a For Sale details page

  Scenario: User Can see the Local Schools Module
    Then I should see "The Homes.com School Score is a ranking system, calculated from state test performance data, and does not reflect a true academic grade scale. State test scores for an individual school are compared against other schools within the same state and education level to rank on the following letter scale (where A+ is the highest and D is the lowest)" as a text in the tooltip
    Then I should see "Scores may not be available for all schools as the test results may be unavailable or incomplete. Private schools are not required to publicly report test results so these schools do not have scores." as a text in the tooltip
    Then I should see "Local Schools" in the shcool module
    And I should see "School Name" in the shcool module
    And I should see "Score" in the shcool module
    And I should see "Class Size" in the shcool module
    And I should see "Distance" in the shcool module
    And I should see "Elementary School" in the shcool module
    And I should see "C" in the shcool module
    And I should see "14" in the shcool module
    And I should see "Middle School" in the shcool module
    And I should see "C+" in the shcool module
    And I should see "14" in the shcool module
    And I should see "Technical High School" in the shcool module
    And I should see "B+" in the shcool module
    And I should see "18" in the shcool module
    And I click the View More Schools Nearby link
    And I should see "Your Hometown, Florida Schools" in the school SRP header
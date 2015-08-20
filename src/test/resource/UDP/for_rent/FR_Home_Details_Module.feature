@portal @UDP @FR @homedetails @homedetailsfr @modules @no
Feature: Seeing Home Details
  As a user
  I want see Home Details to have a better idea about the listing

  Background: I am on a details page

  Scenario: Seeing Features & Amenities module in a For Rent UDP
    Given I am on a For Rent details page
    When I scroll down
    Then I should see "Bedroom(s)" as the text for line item 1 FR
    And I should see "Bathroom(s)" as the text for line item 2 FR
    And I should see "Square Footage" as the text for line item 3 FR
    And I should see "Price Per SqFt" as the text for line item 4 FR
    And I should see "Lot Size" as the text for line item 5 FR
    And I should see "Stories" as the text for line item 6 FR
    And I should see "Property Type" as the text for line item 7 FR
    And I should see "Year Built" as the text for line item 8 FR
    And I should see "MLS #" as the text for line item 9 FR
    And I should see "Neighborhood" as the text for line item 10 FR
    And I should see "County" as the text for line item 11 FR
    And I should see "Monthly Est. Mortgage" as the text for line item 12 FR
    And I should see "Monthly Est. Insurance" as the text for line item 13 FR
    And I should see "Monthly Property Tax" as the text for line item 14 FR
    And I should see "Last Updated" as the text for line item 15 FR
    And I should see "Last Sold Date" as the text for line item 16 FR
    And I should see "Last Sold Price" as the text for line item 17 FR
    Then I click the See More Details button
    And I should see "Total Rooms" as the text for line item 18 FR
    And I should see "Garage SqFt" as the text for line item 19 FR
    And I should see "Year Updated" as the text for line item 20 FR
    And I should see "Cooling System" as the text for line item 21 FR
    And I should see "Heating System" as the text for line item 22 FR
    And I should see "Heating Source" as the text for line item 23 FR
    And I should see "Tax Year" as the text for line item 24 FR
    And I should see "Tax Amount" as the text for line item 25 FR
    And I should see "High School" as the text for line item 26 FR
    And I should see "Middle School" as the text for line item 27 FR
    And I should see "Elementary School" as the text for line item 28 FR
    And I should see "School District" as the text for line item 29 FR
    And I should see "Public County Property Record information is provided by © SmartZip Analytics, Inc. and ©2011 Fast Forward, Inc. Information is deemed reliable, but not guaranteed"

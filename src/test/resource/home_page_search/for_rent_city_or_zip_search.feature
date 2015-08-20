@completed 
Feature: Searching for For Rent listings
  As a User
  I want to search for for rent listings in an area
  So I can find the perfect home

  Background: I am on a Home Page
    Given I am on the home page

  Scenario Outline: Searching for For RENT Listings
    When I enter "<City>" in the search field
    And I select For Rent
    And I click the search button
    Then I check the title contains "<Title>"
    And I can see number of results on the search page
    And I check the header is "<Header>"

    Examples: 
      | City                   | Header                                | Title                                      |
      | Norfolk, VA            | Norfolk, VA Homes for Rent            | Homes for Rent in Norfolk, VA              |
      | San Diego, CA          | San Diego, CA Homes for Rent          | Homes for Rent in San Diego, CA            |
      | Desert Hot Springs, CA | Desert Hot Springs, CA Homes for Rent | Homes for Rent in Desert Hot Springs, CA   |
      | 23456                  | Virginia Beach, VA 23456 Rental Homes | Rental Homes in Virginia Beach, VA 23456   |
      
 
@completed @forsale @test
Feature: Searching for FOr Sale listings
  As a User
  I want to search for listings in an area
  So I can find the perfect home

  Scenario Outline: Searching for For SALE Listings
    Given I am on the home page
    When I enter "<City>" in the search field
    And I click the search button
    Then I check the title contains "<Title>"
    And I can see number of results on the search page
    And I check the header is "<Header>"

    Examples: 
      | City                   | Header                                   | Title                                                  |
      | Norfolk, VA            | Homes for Sale in Norfolk, VA            | Norfolk, VA Homes for Sale & Real Estate               |
      | San Diego, CA          | Homes for Sale in San Diego, CA          | San Diego, CA Homes for Sale & Real Estate             |
      | Desert Hot Springs, CA | Homes for Sale in Desert Hot Springs, CA | Desert Hot Springs, CA Homes for Sale & Real Estate    |
      | 23508                  | 23508 Homes for Sale (Norfolk, VA)       | 23508 Homes for Sale & Real Estate (Norfolk, VA 23508) |

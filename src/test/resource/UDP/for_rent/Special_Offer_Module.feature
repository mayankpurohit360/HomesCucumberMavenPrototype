@portal @UDP @specialoffer @modules
Feature: Seeing the Special Offers Module
	As a user
	I want see the offered deals

	Background: I am on a For Sale details page
		Given I am on a For Rent details page

	Scenario: Seeing Features & Amenities module
		When I scroll down
		Then I should see "Get These Great Deals"
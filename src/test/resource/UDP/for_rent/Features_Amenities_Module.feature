@portal @UDP @featuresfr @modules @no
Feature: Seeing Features & Amenities
	As a user
	I want see Features & Amenities to have a better idea about the listing 

	Background: I am on a For Sale details page
		Given I am on a For Rent details page

	Scenario: Seeing Features & Amenities module
		Then I should see "Features & Amenities"
		And I should see "Additional Features"
		And I should see "Building Features"
		And I should see "Foundation Size REALLY REALLY BIG"
		And I should see "Basement"
		And I should see "Lot Features"
		And I should see "Fence"
		And I should see "Horse Facilities"
		And I should see "View"
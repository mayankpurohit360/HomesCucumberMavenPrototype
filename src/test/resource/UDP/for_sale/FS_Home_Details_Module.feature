@portal @UDP @FS @homedetailsfs @homedetails @modules 
Feature: Seeing Home Details
	As a user
	I want see Home Details to have a better idea about the listing 

	Background: I am on a details page

	Scenario: Seeing Features & Amenities module in a For Sale UDP
		Given I am on a For Sale details page
		When I scroll down
		Then I should see "Bedroom(s)" as the text for line item 1 FS
		And I should see "Bathroom(s)" as the text for line item 2 FS
		And I should see "Square Footage" as the text for line item 3 FS
		And I should see "Price Per SqFt" as the text for line item 4 FS
		And I should see "Lot Size" as the text for line item 5 FS
		And I should see "Stories" as the text for line item 6 FS
		And I should see "Property Type" as the text for line item 7 FS
		And I should see "Year Built" as the text for line item 8 FS
		And I should see "MLS #" as the text for line item 9 FS
		And I should see "Neighborhood" as the text for line item 10 FS
		And I should see "County" as the text for line item 11 FS
		And I should see "Monthly Est. Mortgage" as the text for line item 12 FS
		And I should see "Monthly Est. Insurance" as the text for line item 13 FS
		And I should see "Monthly Property Tax" as the text for line item 14 FS
		And I should see "Last Updated" as the text for line item 15 FS
		And I should see "Last Sold Date" as the text for line item 16 FS
		And I should see "Last Sold Price" as the text for line item 17 FS

		Then I click the See More Details button
		And I should see "Total Rooms" as the text for line item 18 FS
		And I should see "Garage SqFt" as the text for line item 19 FS
		And I should see "Year Updated" as the text for line item 20 FS
		And I should see "Cooling System" as the text for line item 21 FS
		And I should see "Heating System" as the text for line item 22 FS
		And I should see "Heating Source" as the text for line item 23 FS
		And I should see "Tax Year" as the text for line item 24 FS
		And I should see "Tax Amount" as the text for line item 25 FS
		And I should see "High School" as the text for line item 26 FS
		And I should see "Middle School" as the text for line item 27 FS
		And I should see "Elementary School" as the text for line item 28 FS
		And I should see "School District" as the text for line item 29 FS


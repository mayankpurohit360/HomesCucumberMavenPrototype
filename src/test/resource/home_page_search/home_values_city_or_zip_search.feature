# Feature: Searching for Home Values listings
# 	As a User
# 	I want to search for home values listings in an area
# 	So I can find have an idea about prices in that area

# 	Background: I am on a Home Page
# 		Given I am on the home page

# 	Scenario Outline: Searching for Home Values Listings
#        When I select Home Values
#       And I click the search button
# 	  	And I can see number of results on the search page
# 		Then I can see "<header1>" as the H1 on the SRP
# 
#  	Examples:
#  		| city                   | header1                                  |
# 		| Norfolk, VA            | Norfolk, VA Home Values                  |
# 		| San Diego, CA          | San Diego, CA Home Values                |
# 	    | Desert Hot Springs, CA | Desert Hot Springs, CA Home Values       |
# 	    | 23456                  | 23456 Home Values                        |
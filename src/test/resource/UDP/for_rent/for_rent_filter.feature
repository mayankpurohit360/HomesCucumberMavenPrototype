@regression @search @rentfilter
Feature: Searching for For Sale listings
	As a User
	I want to search for listings in an area
	So I can find the perfect home

	Background: I am on for rent page
		Given I am on for rent page
		
	
	Scenario: Submit the form only with all Listing type with property ALL
	
		When Click listing drop down
		Then Click on Update Button
	
	Scenario: Submit the form only with Uncheck all Listing type 
	 
	   When Click listing drop down
	   And Click rental listing type
	   Then Click on Update Button 
	
	Scenario: Submit the form only with Senior Community all Listing type 
	   When Click listing drop down
	    And Click rental listing type
	   And Click senior community listing type
	    Then Click on Update Button 
	
	Scenario: Submit the form only with CORPORATE HOUSING all Listing type 
	   When Click listing drop down
	    And Click rental listing type
	   And Click CORPORATE HOUSING listing type
	   Then Click on Update Button
	    
	    
	    Scenario: Submit the form only with Senior Community + Corporate Housing all Listing type 
	   When Click listing drop down
	   And Click rental listing type
	   And Click senior community listing type
	  Then Click on Update Button
	    
	    Scenario: Submit the form only with Senior Community + Rental Housing all Listing type 
	   When Click listing drop down
	    And Click senior community listing type
	    Then Click on Update Button
	    
	  Scenario: Submit the form only with CORPORATE HOUSING + Rental Housing all Listing type 
	   When Click listing drop down
	   And Click CORPORATE HOUSING listing type
	   Then Click on Update Button
	    
	  Scenario: Submit the form only with CORPORATE HOUSING + Rental Housing all Listing type 
	   When Click listing drop down
	   And Click CORPORATE HOUSING listing type
	   And Click senior community listing type
	   Then Click on Update Button
	   
	 Scenario: Submit the form only with all property type 
	   When Click property type drop down
	   Then Click on Update Button on Property type dopdown
	   
	 Scenario: Submit the form only with all property type 
	   When Click property type drop down
	   Then I click ALL property type
	   Then Click on Update Button on Property type dopdown
	   
	   Scenario: Submit the form only with Resdential property type 
	   When Click property type drop down
	   Then I click ALL property type
	   Then I click RESIDENTIAL property type
	   Then Click on Update Button on Property type dopdown
	   
	   Scenario: Submit the form only with TownHouse property type 
	   When Click property type drop down
	   Then I click ALL property type
	   Then I click TOWNHOUSE property type
	   Then Click on Update Button on Property type dopdown
	   
	    Scenario: Submit the form only with CONDOMINIUM property type 
	   When Click property type drop down
	   Then I click ALL property type
	   Then I click CONDOMINIUM property type
	   Then Click on Update Button on Property type dopdown
	   
	    Scenario: Submit the form only with APARTMENT property type 
	   When Click property type drop down
	   Then I click ALL property type
	   Then I click APARTMENT property type
	   Then Click on Update Button on Property type dopdown
	   
	   Scenario: Submit the form only with Retal listing type + Resential property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   And I click RESIDENTIAL property type
	   Then Click on Update Button on Property type dopdown
	   
	     Scenario: Submit the form only with Retal listing type + CONDOMINIUM property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	    Then I click CONDOMINIUM property type
	   Then Click on Update Button on Property type dopdown
	   
	      Scenario: Submit the form only with Retal listing type + APARTMENT property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   Then I click APARTMENT property type
	   Then Click on Update Button on Property type dopdown
	   
	    Scenario: Submit the form only with Retal listing type + Resential+ CONDOMINIUM property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   And I click RESIDENTIAL property type
	    Then I click CONDOMINIUM property type
	   Then Click on Update Button on Property type dopdown
	   
	    Scenario: Submit the form only with Retal listing type + Resential+ APARTMENT property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   And I click RESIDENTIAL property type
	    Then I click APARTMENT property type
	   Then Click on Update Button on Property type dopdown
	   
	   Scenario: Submit the form only with Retal listing type + CONDOMINIUM+ APARTMENT property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   Then I click CONDOMINIUM property type
	    Then I click APARTMENT property type
	   Then Click on Update Button on Property type dopdown
	   
	      Scenario: Submit the form only with Retal listing type + CONDOMINIUM+ APARTMENT+ Resential property type 
	   When Click listing drop down
	   Then Click on Update Button
	   Then Close the popup window
	   Then Click property type drop down
	   And I click ALL property type
	   And I click RESIDENTIAL property type
	   Then I click CONDOMINIUM property type
	    Then I click APARTMENT property type
	   Then Click on Update Button on Property type dopdown
	   
	   
	   
    
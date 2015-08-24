@portal @UDP @rates @modules @mortagefirst @mortgage
Feature: Seeing Estimated Mortgage Rates
As a user
I can see the and interact with the Estimated Mortgage Rates Module

Scenario: Interacting with the bankrate widget in the Estimated Mortage Rates Module
 Given I am on a For Sale details page that has the bankrate widget
Then I scroll down couple of times	
And I should see "Estimated Mortgage Rates" as the title for the estimated mortgage rate module header at position 6
Then I can see the Estimated Mortgage Rates Module
Then I should see "30 Year Fixed Mortgage, All Points" as the text for the product name
Then I can see the bankrate credit score slider
Then I should see "Excellent (740+)" as the value for the credit score
Then I drag the credit score slider all the way to the left
Then I should see "Average (660)" as the value for the credit score
Then I drag the credit score slider to the right
Then I should see "Good (700)" as the value for the credit score
Then I can see the bankrate downpayment slider
Then I should see "20 %" as the value for the down payment
Then I drag the down payment slider all the way to the right
Then I should see "40 %" as the value for the down payment
Then I drag the down payment slider all the way to the left
Then I should see "5 %" as the value for the down payment
#Then I click the bankrate Disclaimer
#Then I should see "Rates were collected by Bankrate.com on the dates specified. Rates are subject to change without notice and may vary from branch to branch. APR and Payment examples shown do not include amounts for taxes and insurance premiums. The monthly payment obligation will be greater if taxes and insurance are included." as a paragraph in the bankrate disclaimer
#Then I should see "These quotes are from banks, thrifts, and brokers, some of whom have paid for a link to their website, where you can find additional information. Many lenders have different rates on their own websites than those posted on Bankrate.com. Please identify yourself as a Bankrate consumer to lenders to ensure you get the Bankrate.com rate. If you believe you have received an inaccurate quote or are otherwise not satisfied with the services provided to you by the lender you choose, please Click here." as a paragraph in the bankrate disclaimer1
#And I close the form
And I click the bankrate See Additional Rates button
Then I should see "Compare Norfolk, VA Mortgage Rates" in the mortgage rate page

Scenario: Interacting with the informa widget in the Estimated Mortage Rates Module
Given I am on a For Sale details page that has the informa widget
Then I scroll down couple of times for see informa widget
And I should see "Estimated Mortgage Rates" as the title for the estimated mortgage rate module header at position 4
Then I can see the Estimated Mortgage Rates Module
##And I can see the informa widget
Then I should see "Data provided by Informa Research Services. Payments do not include amounts for taxes and insurance premiums. The actual payment obligation will be greater if taxes and insurance are included.Click" as a paragraph in the informa disclaimer
Then I should see "for more information on rates and product details. CA Bur. of Real Estate, Lic. #01937608." as a paragraph in the informa disclaimer
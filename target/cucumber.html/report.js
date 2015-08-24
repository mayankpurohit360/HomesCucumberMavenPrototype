$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mort_refi_request\\estimate_mortage_rate.feature");
formatter.feature({
  "line": 2,
  "name": "Seeing Estimated Mortgage Rates",
  "description": "As a user\r\nI can see the and interact with the Estimated Mortgage Rates Module",
  "id": "seeing-estimated-mortgage-rates",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@portal"
    },
    {
      "line": 1,
      "name": "@UDP"
    },
    {
      "line": 1,
      "name": "@rates"
    },
    {
      "line": 1,
      "name": "@modules"
    },
    {
      "line": 1,
      "name": "@mortagefirst"
    },
    {
      "line": 1,
      "name": "@mortgage"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Interacting with the bankrate widget in the Estimated Mortage Rates Module",
  "description": "",
  "id": "seeing-estimated-mortgage-rates;interacting-with-the-bankrate-widget-in-the-estimated-mortage-rates-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on a For Sale details page that has the bankrate widget",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I scroll down couple of times",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Estimated Mortgage Rates\" as the title for the estimated mortgage rate module header at position 6",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can see the Estimated Mortgage Rates Module",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see \"30 Year Fixed Mortgage, All Points\" as the text for the product name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I can see the bankrate credit score slider",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see \"Excellent (740+)\" as the value for the credit score",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I drag the credit score slider all the way to the left",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should see \"Average (660)\" as the value for the credit score",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I drag the credit score slider to the right",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I should see \"Good (700)\" as the value for the credit score",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I can see the bankrate downpayment slider",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should see \"20 %\" as the value for the down payment",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I drag the down payment slider all the way to the right",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I should see \"40 %\" as the value for the down payment",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I drag the down payment slider all the way to the left",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I should see \"5 %\" as the value for the down payment",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Then I click the bankrate Disclaimer"
    },
    {
      "line": 25,
      "value": "#Then I should see \"Rates were collected by Bankrate.com on the dates specified. Rates are subject to change without notice and may vary from branch to branch. APR and Payment examples shown do not include amounts for taxes and insurance premiums. The monthly payment obligation will be greater if taxes and insurance are included.\" as a paragraph in the bankrate disclaimer"
    },
    {
      "line": 26,
      "value": "#Then I should see \"These quotes are from banks, thrifts, and brokers, some of whom have paid for a link to their website, where you can find additional information. Many lenders have different rates on their own websites than those posted on Bankrate.com. Please identify yourself as a Bankrate consumer to lenders to ensure you get the Bankrate.com rate. If you believe you have received an inaccurate quote or are otherwise not satisfied with the services provided to you by the lender you choose, please Click here.\" as a paragraph in the bankrate disclaimer1"
    },
    {
      "line": 27,
      "value": "#And I close the form"
    }
  ],
  "line": 28,
  "name": "I click the bankrate See Additional Rates button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should see \"Compare Norfolk, VA Mortgage Rates\" in the mortgage rate page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.NavigateToSaleDetailBankRateWidget()"
});
formatter.result({
  "duration": 44996830450,
  "status": "passed"
});
formatter.match({
  "location": "Steps.ScrollPopertyDetailPage()"
});
formatter.result({
  "duration": 438902763,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Estimated Mortgage Rates",
      "offset": 14
    }
  ],
  "location": "Steps.MatchMessage(String)"
});
formatter.result({
  "duration": 2530630918,
  "status": "passed"
});
formatter.match({
  "location": "Steps.SeeEstimateMortageRate()"
});
formatter.result({
  "duration": 71683667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30 Year Fixed Mortgage, All Points",
      "offset": 14
    }
  ],
  "location": "Steps.fixedMortageMatchMessage(String)"
});
formatter.result({
  "duration": 578930448,
  "status": "passed"
});
formatter.match({
  "location": "Steps.BankRateCreditScoreSlider()"
});
formatter.result({
  "duration": 77046900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Excellent (740+)",
      "offset": 14
    }
  ],
  "location": "Steps.MatchExcellentMessage(String)"
});
formatter.result({
  "duration": 20365820916,
  "status": "passed"
});
formatter.match({
  "location": "Steps.DragSlider()"
});
formatter.result({
  "duration": 51304416841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Average (660)",
      "offset": 14
    }
  ],
  "location": "Steps.MatchExcellentMessage(String)"
});
formatter.result({
  "duration": 20954428645,
  "status": "passed"
});
formatter.match({
  "location": "Steps.DragSliderRight()"
});
formatter.result({
  "duration": 33587570275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Good (700)",
      "offset": 14
    }
  ],
  "location": "Steps.MatchExcellentMessage(String)"
});
formatter.result({
  "duration": 20405015045,
  "status": "passed"
});
formatter.match({
  "location": "Steps.BankRateDownPayementSlider()"
});
formatter.result({
  "duration": 89363641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20 %",
      "offset": 14
    }
  ],
  "location": "Steps.MatchCreditScoreValue(String)"
});
formatter.result({
  "duration": 365408867,
  "status": "passed"
});
formatter.match({
  "location": "Steps.DragDownPayementSliderRight()"
});
formatter.result({
  "duration": 30197241252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40 %",
      "offset": 14
    }
  ],
  "location": "Steps.MatchCreditScoreValue(String)"
});
formatter.result({
  "duration": 675472317,
  "status": "passed"
});
formatter.match({
  "location": "Steps.DragDownPayementSliderLeft()"
});
formatter.result({
  "duration": 35816216321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5 %",
      "offset": 14
    }
  ],
  "location": "Steps.MatchCreditScoreValue(String)"
});
formatter.result({
  "duration": 696281149,
  "status": "passed"
});
formatter.match({
  "location": "Steps.ClickBankRateAdditiobalButton()"
});
formatter.result({
  "duration": 1254423293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Compare Norfolk, VA Mortgage Rates",
      "offset": 14
    }
  ],
  "location": "Steps.MatchRatePageMessage(String)"
});
formatter.result({
  "duration": 5399502242,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Interacting with the informa widget in the Estimated Mortage Rates Module",
  "description": "",
  "id": "seeing-estimated-mortgage-rates;interacting-with-the-informa-widget-in-the-estimated-mortage-rates-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "I am on a For Sale details page that has the informa widget",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I scroll down couple of times for see informa widget",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I should see \"Estimated Mortgage Rates\" as the title for the estimated mortgage rate module header at position 4",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I can see the Estimated Mortgage Rates Module",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "##And I can see the informa widget"
    }
  ],
  "line": 37,
  "name": "I should see \"Data provided by Informa Research Services. Payments do not include amounts for taxes and insurance premiums. The actual payment obligation will be greater if taxes and insurance are included.Click\" as a paragraph in the informa disclaimer",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I should see \"for more information on rates and product details. CA Bur. of Real Estate, Lic. #01937608.\" as a paragraph in the informa disclaimer",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.NavigateToSaledetailPageInformaWidget()"
});
formatter.result({
  "duration": 24449179055,
  "status": "passed"
});
formatter.match({
  "location": "Steps.ScrollPopertyDetailPageforseeInforma()"
});
formatter.result({
  "duration": 243765745,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Estimated Mortgage Rates",
      "offset": 14
    }
  ],
  "location": "Steps.MatchMessage1(String)"
});
formatter.result({
  "duration": 611329437,
  "status": "passed"
});
formatter.match({
  "location": "Steps.SeeEstimateMortageRate()"
});
formatter.result({
  "duration": 54894143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data provided by Informa Research Services. Payments do not include amounts for taxes and insurance premiums. The actual payment obligation will be greater if taxes and insurance are included.Click",
      "offset": 14
    }
  ],
  "location": "Steps.Matchinfodisclaminer(String)"
});
formatter.result({
  "duration": 306200675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "for more information on rates and product details. CA Bur. of Real Estate, Lic. #01937608.",
      "offset": 14
    }
  ],
  "location": "Steps.Matchinfodisclaminer(String)"
});
formatter.result({
  "duration": 297730945,
  "status": "passed"
});
formatter.uri("mort_refi_request\\mortgage_request_connect.feature");
formatter.feature({
  "line": 2,
  "name": "Submitting Mortage Lead from the Mortgage Request Connect page",
  "description": "As a user\r\nI want to submit a mortgage lead\r\nSo I can get a mortgage",
  "id": "submitting-mortage-lead-from-the-mortgage-request-connect-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@portal"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@mortgage"
    },
    {
      "line": 1,
      "name": "@mortgage1"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "I am on the Mortgage Request page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Mortgage Request Connect page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.NavigateToHomePage1()"
});
formatter.result({
  "duration": 7301701497,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#http://www.homes.com/Content/MortgageRequestConnect.cfm/"
    }
  ],
  "line": 11,
  "name": "Submitting Mortage Lead with all required information",
  "description": "",
  "id": "submitting-mortage-lead-from-the-mortgage-request-connect-page;submitting-mortage-lead-with-all-required-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter \"500\" in the loan amount field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select \"10%\" from the downpayment dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select \"Average 640 - 679\" from the credit rating dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"Yes, in last 2 years\" from the bankruptcy History dropdown1",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"Your Hometown\" in the city field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select \"Florida\" from the state dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"Test\" in the first name field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"Lead\" in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter \"1234567890\" in the phone field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter \"Mort_Request@regression.test\" in the email field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click the get grequalified button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see \"Message Sent!\" in the new page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I should see \"Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:\" in the new page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 9
    }
  ],
  "location": "Steps.PopulateLoanAmount(String)"
});
formatter.result({
  "duration": 337117902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10%",
      "offset": 10
    }
  ],
  "location": "Steps.DownPayementDrop(String)"
});
formatter.result({
  "duration": 2067227014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Average 640 - 679",
      "offset": 10
    }
  ],
  "location": "Steps.CreditDrop(String)"
});
formatter.result({
  "duration": 629222401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes, in last 2 years",
      "offset": 10
    }
  ],
  "location": "Steps.Bankrup(String)"
});
formatter.result({
  "duration": 488907308,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Hometown",
      "offset": 9
    }
  ],
  "location": "Steps.EnterCity(String)"
});
formatter.result({
  "duration": 229730423,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Florida",
      "offset": 10
    }
  ],
  "location": "Steps.StateDrop(String)"
});
formatter.result({
  "duration": 408507196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterFirstName(String)"
});
formatter.result({
  "duration": 150047730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lead",
      "offset": 9
    }
  ],
  "location": "Steps.EnterLastName(String)"
});
formatter.result({
  "duration": 165701920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890",
      "offset": 9
    }
  ],
  "location": "Steps.EnterPhoneName(String)"
});
formatter.result({
  "duration": 170988536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mort_Request@regression.test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterEmailName(String)"
});
formatter.result({
  "duration": 217561052,
  "status": "passed"
});
formatter.match({
  "location": "Steps.PrequalifiedButton()"
});
formatter.result({
  "duration": 7381840964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Message Sent!",
      "offset": 14
    }
  ],
  "location": "Steps.RefiRequestNewPage(String)"
});
formatter.result({
  "duration": 552086419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:",
      "offset": 14
    }
  ],
  "location": "Steps.RefiRequestNewPage(String)"
});
formatter.result({
  "duration": 59936976,
  "status": "passed"
});
formatter.uri("mort_refi_request\\refi_request.feature");
formatter.feature({
  "line": 2,
  "name": "Submitting Refinance Lead from Refinance Request page",
  "description": "As a user\nI want to submit a Refinance Request\nSo I can refinance my mortgage",
  "id": "submitting-refinance-lead-from-refinance-request-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@portal"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@mortgage"
    },
    {
      "line": 1,
      "name": "@mortgage2"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "I am on the Refinance Request page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Refinance Request page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.NavigateToMortgage()"
});
formatter.result({
  "duration": 12727251532,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#http://www.homes.com/Content/RefiRequest.cfm"
    }
  ],
  "line": 11,
  "name": "Submitting Mortage Lead with all required information",
  "description": "",
  "id": "submitting-refinance-lead-from-refinance-request-page;submitting-mortage-lead-with-all-required-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I select \"Average 640 - 679\" from the credit rating dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select \"Yes, in last 2 years\" from the bankruptcy History dropdown1",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"700\" in the loan amount field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Your Hometown\" in the city field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select \"Florida\" from the state dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"Test\" in the first name field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"Lead\" in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"1234567890\" in the phone field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter \"Refi_Request@regression.test\" in the email field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter \"100\" in Estimated Property Value field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click the Submit Request button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see \"Message Sent!\" in the new page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I should see \"Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:\" on refi request page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Average 640 - 679",
      "offset": 10
    }
  ],
  "location": "Steps.CreditDrop(String)"
});
formatter.result({
  "duration": 780415363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes, in last 2 years",
      "offset": 10
    }
  ],
  "location": "Steps.Bankrup(String)"
});
formatter.result({
  "duration": 670566589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "700",
      "offset": 9
    }
  ],
  "location": "Steps.PopulateLoanAmount(String)"
});
formatter.result({
  "duration": 167859311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Hometown",
      "offset": 9
    }
  ],
  "location": "Steps.EnterCity(String)"
});
formatter.result({
  "duration": 738415342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Florida",
      "offset": 10
    }
  ],
  "location": "Steps.StateDrop(String)"
});
formatter.result({
  "duration": 560309799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterFirstName(String)"
});
formatter.result({
  "duration": 262273849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lead",
      "offset": 9
    }
  ],
  "location": "Steps.EnterLastName(String)"
});
formatter.result({
  "duration": 219360649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890",
      "offset": 9
    }
  ],
  "location": "Steps.EnterPhoneName(String)"
});
formatter.result({
  "duration": 241782852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Refi_Request@regression.test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterEmailName(String)"
});
formatter.result({
  "duration": 239736171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 9
    }
  ],
  "location": "Steps.EstimatePropertyValue(String)"
});
formatter.result({
  "duration": 135132589,
  "status": "passed"
});
formatter.match({
  "location": "Steps.ClickSubmitRequest()"
});
formatter.result({
  "duration": 48148613991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Message Sent!",
      "offset": 14
    }
  ],
  "location": "Steps.RefiRequestNewPage(String)"
});
formatter.result({
  "duration": 1044767420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thanks for submitting your information. A mortgage professional should be getting in touch with you shortly. Now that your information has been sent, where would you like to go:",
      "offset": 14
    }
  ],
  "location": "Steps.MatchRefiRequest(String)"
});
formatter.result({
  "duration": 66587678,
  "status": "passed"
});
formatter.uri("mort_refi_request\\request_home_estimate.feature");
formatter.feature({
  "line": 2,
  "name": "Submitting Request Home Estimate Lead",
  "description": "As a user\r\nI want to submit a Request Home Estimate\r\nSo I can get a Home Estimate",
  "id": "submitting-request-home-estimate-lead",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@portal"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@mortgage3"
    },
    {
      "line": 1,
      "name": "@mortgage"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "I am on the Request Home Estimate page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Request Home Estimate page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.NavigateToRequestHomeEstimate()"
});
formatter.result({
  "duration": 11139949967,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#http://www.homes.com/Content/SoldHomesRequest.cfm"
    }
  ],
  "line": 11,
  "name": "Submitting Request Home Estimate Form",
  "description": "",
  "id": "submitting-request-home-estimate-lead;submitting-request-home-estimate-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I enter \"150 Main Street\" in the address field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter \"Your Hometown\" in the city field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select \"Florida\" from the state dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"33333\" in the zip field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"Test\" in the first name field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"Lead\" in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"1234567890\" in the phone field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"Request_Home_Estimate@regression.test\" in the email field on the mortgage page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click the submitCMARequestFormButton",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see \"Your request has been sent\" in the new page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I should see \"Thank you for completing the free home market analysis. An agent will be contacting you soon with information regarding the home and surrounding real estate market.\" on home estimate",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "150 Main Street",
      "offset": 9
    }
  ],
  "location": "Steps.RequestHomeEstimateAddress(String)"
});
formatter.result({
  "duration": 677067356,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Hometown",
      "offset": 9
    }
  ],
  "location": "Steps.EnterCity(String)"
});
formatter.result({
  "duration": 742898023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Florida",
      "offset": 10
    }
  ],
  "location": "Steps.StateDrop(String)"
});
formatter.result({
  "duration": 474342995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "33333",
      "offset": 9
    }
  ],
  "location": "Steps.RequestHomeZip(String)"
});
formatter.result({
  "duration": 174563537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterFirstName(String)"
});
formatter.result({
  "duration": 200830916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lead",
      "offset": 9
    }
  ],
  "location": "Steps.EnterLastName(String)"
});
formatter.result({
  "duration": 181559935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890",
      "offset": 9
    }
  ],
  "location": "Steps.EnterPhoneName(String)"
});
formatter.result({
  "duration": 180358981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Request_Home_Estimate@regression.test",
      "offset": 9
    }
  ],
  "location": "Steps.EnterEmailName(String)"
});
formatter.result({
  "duration": 322798838,
  "status": "passed"
});
formatter.match({
  "location": "Steps.submitCMARequestFormButton()"
});
formatter.result({
  "duration": 224868687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your request has been sent",
      "offset": 14
    }
  ],
  "location": "Steps.RefiRequestNewPage(String)"
});
formatter.result({
  "duration": 71387094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for completing the free home market analysis. An agent will be contacting you soon with information regarding the home and surrounding real estate market.",
      "offset": 14
    }
  ],
  "location": "Steps.MatchHomeEstimate(String)"
});
formatter.result({
  "duration": 66862622,
  "status": "passed"
});
});
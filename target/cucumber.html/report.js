$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mort_refi_request\\request_home_estimate.feature");
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
  "duration": 14730358184,
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
  "duration": 891137717,
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
  "duration": 1053087772,
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
  "duration": 691418231,
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
  "duration": 277358175,
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
  "duration": 285041540,
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
  "duration": 214050233,
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
  "duration": 241581895,
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
  "duration": 322171271,
  "status": "passed"
});
formatter.match({
  "location": "Steps.submitCMARequestFormButton()"
});
formatter.result({
  "duration": 221257764,
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
  "duration": 88496360,
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
  "duration": 145238671,
  "status": "passed"
});
});
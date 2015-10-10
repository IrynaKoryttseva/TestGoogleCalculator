Narrative:
As a user
User want to check  buttons in Google calculator
So that User got result

Scenario: check button works
Given open Google Chrome browser,go to Google main page
And User go to Google calculator page
When User click buttons in the Google calculator
Then Google calculator achieved  $expectedResult
Examples:
|$expectedResult|
|0.123456789|
Narrative:
As a user
User want to check  function  in Google calculator
So that User got result

Scenario: check function multiply
Given open Google Chrome browser,go to Google main page
And User go to Google calculator page
When User prepare $operand1 and $operand2 in the Google calculator MULTIPLY
Then Google calculator3 achieved $multiplyExpectedResult
Examples:
|$operand1|$operand2|$multiplyExpectedResult|
|100|100|10000|
|0|0|0|
|0|2147483648|0|
|-2147483648|0|0|
|-2|2|-4|
|-2.2|-1.2|2.64|
|123456789.01|0|0|
|0|10.01|0|
|10.01|10.01|100.2001|
|5.234554||Error|
|10||Error|


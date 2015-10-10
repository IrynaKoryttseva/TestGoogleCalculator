Narrative:
As a user
User want to check  function  in Google calculator
So that User got result

Scenario: check function add
Given open Google Chrome browser,go to Google main page
And User go to Google calculator page
When User prepare $operand1 and $operand2 in the Google calculator ADD
Then Google calculator1 achieved $addExpectedResult
Examples:
|$operand1|$operand2|$addExpectedResult|
|100|100|200|
|0|0|0|
|0|2147483648|2147483648|
|-2147483648|0|-2147483648|
|-2147483648|2147483648|0|
|-2147483648.123456789|2147483647.000000009|-1.12345695496|
|123456789.01|0|123456789.01|
|0|10.01|10.01|
|10.01|10.01|20.02|
|5.234554||Error|
|10||Error|


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

Scenario: check function subtract
Given open Google Chrome browser,go to Google main page
And User go to Google calculator page
When User prepare $operand1 and $operand2 in the Google calculator SUBTRACT
Then Google calculator2 achieved $subtractExpectedResult
Examples:
|$operand1|$operand2|$subtractExpectedResult|
|100|100|0|
|0|0|0|
|0|2147483648|-2147483648|
|-2147483648|0|-2147483648|
|-2147483648|2147483648|-2361967296|
|-2147483648.123456789|0.000000001|-2147483648.12345679|
|123456789.01|0|123456789.01|
|0|10.01|-10.01|
|10.01|10.01|0|
|5.234554||Error|
|10||Error|

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

Scenario: check function divide
Given open Google Chrome browser,go to Google main page
And User go to Google calculator page
When User prepare $operand1 and $operand2 in the Google calculator DIVIDE
Then Google calculator4 achieved $divideExpectedResult
Examples:
|$operand1|$operand2|$divideExpectedResult|
|100|100|1|
|0|2147483648|0|
|-2|2|-1|
|-2.2|-2.2|1|
|123456789.01|0|0|
|0|10.01|0|
|10.01|10.01|100.2001|
|0|0|infinity|
|-2147483648|0|infinity|
|10||Error|
|5.234554||Error|
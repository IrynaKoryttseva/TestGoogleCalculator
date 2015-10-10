Narrative:
As a user
User want to check  function  in Google calculator
So that User got result

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
|123456789.01|0|Infinity|
|0|10.01|0|
|10.01|10.01|1|
|0|0|Error|
|-2147483648|0|-Infinity|
|2147483648|0|Infinity|
|10||Error|
|5.234554||Error|
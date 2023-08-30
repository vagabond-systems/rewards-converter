# :airplane: Credit Rewards Converter :airplane:

These are unit tests written using the JUnit testing framework to verify the correctness of the RewardValue class's conversion logic for converting between cash and miles.
The tests ensure that the conversion methods work as expected and that the calculated values match the expected values based on the given conversion rate.

convert_from_cash_to_miles() Test:

This test method checks the conversion from cash to miles.
It first defines a cashValue of 100.
The variable convertedMilesValue calculates the value of the equivalent miles by dividing cashValue by the conversionRate. 
The result is cast to an integer.
A RewardValue object is created using the cashValue.
The assertEquals() assertion verifies that the convertedMilesValue matches the result of rewardValue.getMilesValue().
This ensures that the cash-to-miles conversion works correctly.

convert_from_miles_to_cash() Test:

This test method checks the conversion from miles to cash.
It defines a milesValue of 10000.
The variable convertedCashValue calculates the equivalent cash value by multiplying milesValue by the conversionRate.
A RewardValue object is created using the milesValue.
The assertEquals() assertion verifies that the convertedCashValue matches the result of rewardValue.getCashValue().
This ensures that the miles-to-cash conversion works correctly.


These tests are crucial for verifying the accuracy of the conversion logic within the RewardValue class. These tests ensure that the conversions are implemented correctly and consistently by comparing the calculated values to the expected values. 
If any part of the conversion logic changes in the future, these tests will act as a safety net, catching any unintended consequences.

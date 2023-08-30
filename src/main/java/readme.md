# :airplane: Credit Rewards Converter :airplane:

A Java class named RewardValue appears to represent a reward system that can convert between cash and airline miles based on a fixed conversion rate.
It includes constructors for initializing reward values and methods to retrieve the cash value or the miles value of a reward.

public double cashValue and public double milesValue These instance variables store the cash value and miles value of a reward.

public static final double conversionRate = 0.0035, This static constant represents the conversion rate between miles and cash. 
The constant value is set to 0.0035.

public RewardValue(double cashValue): This constructor accepts a cash value as a parameter and initializes the instance variables. It calculates the value of the equivalent miles by dividing the provided cash value by the fixed conversionRate.

public RewardValue(int milesValue): This constructor accepts the value of a mile as a parameter and initializes the instance variables. It calculates the equivalent cash value by multiplying the provided miles value by the fixed conversionRate.

public double getCashValue(): This method returns the stored cash value of the reward.

public int getMilesValue(): This method returns the stored miles value of the reward, converted to an integer.

The purpose of this class is to encapsulate the logic for converting between cash and miles based on the provided conversion rate.
Clients can create RewardValue objects with either cash or miles values, and then retrieve the corresponding values using the getCashValue() and getMilesValue() methods.

The class allows users to work with either cash or mileage values and abstracts the conversion logic away from the users, 
making conversions easier to perform without having to remember the conversion formula.

    // Made By Iolo Evans Jones for Forage's J.P Morgan & Chase's online work experience
    // The RewardValue class represents the value of a reward, which can be represented
    // in two interchangeable formats: cash or miles.
public class RewardValue {

    // This is a conversion rate constant used to convert between miles and cash.
    // It is public and final since it is a constant value, which means it should be accessible anywhere
    // but should not be modifiable.
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // This private method converts a miles value to its equivalent cash value.
    // It is used internally to handle conversions and should not be directly accessed outside the class.
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // This private method converts a cash value to its equivalent miles value.
    // It is used internally to handle conversions and should not be directly accessed outside the class.
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // This is the cash equivalent value of the reward.
    // It is the internal standard that all RewardValue instances will use,
    // whether they are initially defined in terms of cash or miles.
    private final double cashValue;

    // This constructor creates a RewardValue object using a miles value.
    // It converts the miles to cash and then stores it.
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // This constructor creates a RewardValue object using a cash value.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // This public method returns the miles equivalent value of the reward.
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    // This public method returns the cash equivalent value of the reward.
    public double getCashValue() {
        return cashValue;
    }
}

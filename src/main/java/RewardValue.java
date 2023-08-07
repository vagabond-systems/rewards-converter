/*
This class, RewardValue, functions as a two-way converter between miles and cash values. It allows users to create objects
with either a cash value or a miles value, but once set, the cash value remains constant and cannot be modified directly
by external users. The class provides methods to obtain the cash value and the corresponding miles value based on a fixed
conversion rate of 0.0035 miles per unit of cash. The private conversion methods handle the actual conversion calculations,
ensuring accurate and consistent conversions between miles and cash.
*/
public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private double convertToCash(int miles) {
        return miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
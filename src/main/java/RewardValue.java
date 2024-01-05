import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    private double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}

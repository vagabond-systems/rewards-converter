
public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = calculateMilesValue(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashValue(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double calculateMilesValue(double cashValue) {
        return cashValue * 3500;
    }

    private double calculateCashValue(double milesValue) {
        return milesValue / 3500;
    }

    public double convertCashToMiles() {
        return calculateMilesValue(cashValue);
    }

    public double convertMilesToCash() {
        return calculateCashValue(milesValue);
    }
}
public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertFromCashToMiles(double cashValue) {
        // Conversion logic: 1 dollar = .35 Miles
        return (int) (cashValue * .35);
    }

    public double convertFromMilesToCash(int milesValue) {
        // Conversion logic: 1 mile = 2.85 Dollars
        return milesValue / .35;
    }
}

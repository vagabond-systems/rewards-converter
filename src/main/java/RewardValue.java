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

    public double convertFromCashToMiles() {
        // Add your conversion logic here
        // For now, let's just return the cash value
        return cashValue;
    }

    public int convertFromMilesToCash() {
        // Add your conversion logic here
        // For now, let's just return the miles value
        return milesValue;
    }
}


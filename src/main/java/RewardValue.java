public class RewardValue {
    double cashValue;
    int milesValue;
    final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONVERSION_RATE);
        // Is this rate correct? In a real work environment I'd reach out to confirm. $300 for 85714 miles seems high.
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
        // "From miles to cash at a rate of 0.0035"
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

public class RewardValue extends RewardsConverter

{
    public double cashValue;
    public double milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValueToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash value to miles
    private double cashValueToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Convert miles to cash value
    private double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    }


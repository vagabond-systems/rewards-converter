public class RewardValue {
    private Double cash = null;
    private Integer miles = null;
    public static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        if (cashValue >= 0)
            cash = cashValue;
        else
            throw new IllegalArgumentException("cash value must be positive");
    }

    public RewardValue(int milesValue) {
        if (milesValue >= 0)
            miles = milesValue;
        else
            throw new IllegalArgumentException("miles value must be positive");
    }

    public double getCashValue() {
        if (cash != null)
            return cash;
        return MILES_TO_CASH * miles;
    }

    public int getMilesValue() {
        if (miles != null)
            return miles;
        return (int) (1 / MILES_TO_CASH * cash);
    }
}
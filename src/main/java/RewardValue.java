public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) { this.cashValue = cashValue; } // contructor

    public RewardValue(int milesValue) { this.cashValue = toCash(milesValue); } // constructor

    private static int toMiles(double cashValue) { return (int) (cashValue / 0.0035); } // CONVERT CASH TO MILES

    private static double toCash(int milesValue) { return (int) milesValue * 0.0035; } // CONVERT MILES TO CASH

    public double getCashValue() { return cashValue; } // GET CASH

    public int getMilesValue() { return toMiles(this.cashValue); } // GET MILES VALUE
}

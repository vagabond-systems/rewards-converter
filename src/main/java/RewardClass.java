import static java.lang.System.out;

public class RewardClass {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardClass(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
        out.println("Initialized with cash: " + cashValue + "miles: " + this.milesValue);
    }

    public RewardClass(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
        out.println("Initialized with miles:" + milesValue + "cash:" + this.cashValue);
    }

    public double getCashValue() {
        out.println("Returning cash value:" + cashValue);
        return cashValue;
    }
    public int getMilesValue() {
        int roundedMilesValue = (int) Math.round(milesValue);
        out.println("Returning miles value: " + roundedMilesValue);
        return roundedMilesValue;
    }
}

public class RewardValue {
    public static final double MILES_TO_CASH_RATE = 0.0035;

    private double cashValue;

    private int milesValue;

    // getters
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    // two constructors
    public RewardValue(double cashValue) {
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    // two methods to convert
    public int cashToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public double milesToCash(int milesValue){
        return milesValue * MILES_TO_CASH_RATE;
    }


}

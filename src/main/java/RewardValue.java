
public class RewardValue {
    private double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        if(cashValue < 0) {
            throw new IllegalArgumentException("Cash value must be positive");
        }
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        if(milesValue < 0) {
            throw new IllegalArgumentException("Miles value must be positive");
        }
        this.cashValue = convertToCash(milesValue);
    }

    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }


}

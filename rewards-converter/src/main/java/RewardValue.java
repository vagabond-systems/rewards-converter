// creating the class of the RewardConverter with improving code 

public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE =0.0035;


    // Constructor accepting CashValue
    public RewardValue(double cashValue) {
        this.cashValue =cashValue;

    }

    // Constructor accepting mileValue
    public RewardValue(int mileValue) {
        this.cashValue =convertToCash(mileValue);
    }

    private static double convertToCash(int mileValue) {
        return mileValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    private static int  convertToMiles(double cashValue) {
        return (int) (cashValue/MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }


}

//public class RewardValue {
//    private double cashValue;
//    private double milesValue;
//
//    public RewardValue(double cashValue) {
//        this.cashValue = cashValue;
//        this.milesValue = cashValue / 0.0035;
//    }
//
//    public RewardValue(double milesValue, boolean isMiles) {
//        if (isMiles) {
//            this.milesValue = milesValue;
//            this.cashValue = milesValue * 0.0035;
//        } else {
//            throw new IllegalArgumentException("Invalid constructor for miles value. Use the other constructor.");
//        }
//    }
//
//    public double getCashValue() {
//        return cashValue;
//    }
//
//    public double getMilesValue() {
//        return milesValue;
//    }
//}

public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
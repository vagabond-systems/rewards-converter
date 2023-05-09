//public class RewardValue {
//    public milesToCashConversionRate = 0.0035;
//    int cashValue = 0;
//    float miles = 0.00F;
//
//    public RewardValue(int cashValue, float miles) {
//        this.cashValue = cashValue;
//        this.miles = miles;
//    }
//    public static void main(String[] args) {
//        RewardValue myCashValue = new getCashValue("$5");
//        RewardValue myMilesValue = new getMilesValue(100);
//        System.out.println(myCashValue.cashValue + " " + myMilesValue.miles);
//    }
//
//}

// the answer key
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

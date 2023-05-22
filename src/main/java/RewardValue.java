public class RewardValue {
    public static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
//    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_RATE;
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    public double getCashValue(){
        return cashValue;
    }
}

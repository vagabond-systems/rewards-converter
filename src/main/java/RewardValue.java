public class RewardValue {
    private final double cashVlaue;
    private static final double CONVERTION_RATE_FROM_MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue){
        this.cashVlaue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashVlaue = convertToCash(milesValue);
    }
    public double getCashValue(){
        return this.cashVlaue;   
    }
    public int getMilesValue(){
        return convertToMiles(this.cashVlaue);
    }
    public static double convertToCash(int mmilesValue){
        return mmilesValue * CONVERTION_RATE_FROM_MILES_TO_CASH;
    }
    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERTION_RATE_FROM_MILES_TO_CASH);
    }
}

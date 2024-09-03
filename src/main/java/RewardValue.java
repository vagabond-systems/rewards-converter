public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }
    private static int cashToMiles(double cash){
        return (int) (cash/ MILES_TO_CASH);
    }
    private static double milesToCash(int miles){
        return miles * MILES_TO_CASH;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return  milesValue;
    }
}

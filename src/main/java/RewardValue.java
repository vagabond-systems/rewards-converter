public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static int convertCashToMiles(double cashValue){
        return  (int) (cashValue / 0.0035);
    }

    public static double convertMilesToCash(int milesValue){
        return milesValue * 0.0035;
    }
}

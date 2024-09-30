public class RewardValue {

    private double cashValue;
    private int milesValue;

    private static double milesToCashRate = 0.0035;

    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = cashToMilesConversion(cash);
    }
    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = milesToCashConversion(miles);
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    private int cashToMilesConversion(double cash){
        return (int) (cash/milesToCashRate);
    }
    private double milesToCashConversion(int miles){
        return (miles*milesToCashRate);
    }
}

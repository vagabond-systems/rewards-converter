public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public static double MileToCash(int mileValue){
        return mileValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public static int CashToMile(double cashValue){
        return (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public RewardValue(int mileValue){
        this.cashValue = MileToCash(mileValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue(){
        return CashToMile(this.cashValue);
    }
}

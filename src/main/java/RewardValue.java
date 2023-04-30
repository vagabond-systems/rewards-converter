public class RewardValue {
    double cashValue = 0;
    int miles = 0;
    private static final double milesToCashRate = 0.0035;


    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = miles / milesToCashRate;
    }


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue * milesToCashRate);
    }


    public int getMilesValue() {
        return miles;
    }

    public double getCashValue() {
        return cashValue;
    }
}

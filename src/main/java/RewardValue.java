public class RewardValue {
    double cashValue = 0;
    int miles = 0;
    public static final double milesToCashRate = 0.0035;


    public RewardValue(int miles){
        this.cashValue = convertFromMilesToCash(miles);
    }


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }


    public double convertFromMilesToCash(int miles){
        return  this.cashValue = miles / milesToCashRate;
    }

    public int convertFromCashToMiles(double cashValue){
        return this.miles = (int) (cashValue * milesToCashRate);
    }

    public int getMilesValue() {
        return convertFromCashToMiles(cashValue);
    }

    public double getCashValue() {
        return cashValue;
    }
}

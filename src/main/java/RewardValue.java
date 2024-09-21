public class RewardValue {
    private final double cashValue;

    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue){
        this.cashValue = miles_to_cash(milesValue);
    }

    private double miles_to_cash(int milesValue) {
        return 0.0035 * milesValue;
    }
    private int cash_to_miles(double cashValue){
        return (int) (cashValue/0.0035);
    }

    double getCashValue(){
        return cashValue;
    }

    int getMilesValue(){
        return cash_to_miles(cashValue);
    }



}

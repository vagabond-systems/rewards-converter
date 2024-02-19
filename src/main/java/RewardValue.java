public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convert_miles_to_cash(milesValue);
    }

    private double convert_miles_to_cash(int milesValue) {
        return milesValue * 0.0035;
    }

    private int convert_cash_to_miles(double cashValue){
        return (int) (cashValue / 0.0035);
    }


    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue() {
        return convert_cash_to_miles(this.cashValue);
    }
}

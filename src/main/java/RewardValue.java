public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double conversionRate = 0.0035;
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }
    double milesToCash(int milesValue){
        return milesValue * conversionRate;
    }
    int cashToMiles(double cashValue){
        return (int) (cashValue / conversionRate);
    }
    double getCashValue(){
        return cashValue;
    }
    int getMilesValue(){
        return milesValue;
    }
}
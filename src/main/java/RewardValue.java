public class RewardValue {
    double cashValue;
    double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }
    public RewardValue(double milesValue, boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = cashToMiles(milesValue);

    }    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
return milesValue;
    }
    private double cashToMiles(double cashValue){
        return cashValue/0.0035;
    }
    private double milesToCash(double milesValue){
        return milesValue*0.0035;
    }
    // miles to cash @0.0035


}

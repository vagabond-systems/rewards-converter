public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use miles constructor.");
        }
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
    private double cashToMiles(double cash){
        return cash * 0.0035;
    }
    private double milesToCash(double miles){
        return miles / 0.0035;
    }
}

public class RewardValue {
    private double cashValue;
    private double miles;

    // constructor accepting cash value
    public RewardValue(double cash){
        this.cashValue = cash;
        this.miles = cash / 0.0035f;
    } 
    
    // constructor accepting miles value
    public RewardValue(double miles){
        this.cashValue = miles * 0.0035f;
        this.miles = miles;
    } 

    public double getCashValue() {
        return this.cashValue;
    }
    public double getMilesValue() {
        return this.miles;
    }
}
public class RewardValue {
    private double cashValue;
    private int miles;

    // constructor accepting cash value
    public RewardValue(miles cash){
        this.cashValue = cash;
        this.miles = cash / 0.0035f;
    } 
    
    // constructor accepting miles value
    public RewardValue(int miles){
        this.cashValue = miles * 0.0035f;
        this.miles = miles;
    } 

    public double getCashValue() {
        return this.cashValue;
    }
    public int getMilesValue() {
        return this.miles;
    }
}
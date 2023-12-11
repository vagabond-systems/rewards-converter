public class RewardValue {
    private double cash;
    private double miles;
    public RewardValue(){}
    public RewardValue(double cash){
        this.cash = cash;
        this.miles = cash / 0.0035;
    }
    public RewardValue(double miles, boolean isMiles) {
        if (isMiles){
            this.miles = miles;
            this.cash = miles * 0.0035;
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}

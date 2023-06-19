public class RewardValue {
    private double cash = 0;
    private double miles = 0;
    private double milesToCashRate = 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = this.cash / milesToCashRate;
    }

    public RewardValue(double cash, double miles){
        this.miles = miles;
        this.cash = this.miles * milesToCashRate;
    }

    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue(){
        return this.miles;
    }
}

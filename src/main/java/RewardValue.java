public class RewardValue {
    double cash;
    float miles;

    // conversion rate from cash to miles
    final double MILES_TO_CASH_RATIO= 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(float miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return this.cash;
    }
    public double getMilesValue(){
        return this.cash*MILES_TO_CASH_RATIO;
    }

}

public class RewardValue {
    //cash input value
    private double cash;

    //Miles to cash conversion rate
    public static final double  MilesToCashRate = 0.0035;

    //initializing Cash value
    public RewardValue(double Cash) {
        this.cash = Cash;
    }

    public RewardValue(int Miles) {
        this.cash = MilesToCash(Miles);
    }

    //Conversion miles to cash method
    public double MilesToCash(int Miles) {
        return ((double) Miles * MilesToCashRate) ;
    }

    //Get Cash Value (identified in RewardsConverter Class)
    public double getCashValue() {
        return cash;
    }

    //Get Miles Value (identified in RewardsConverter Class)
    public int getMilesValue(){
        return (int) (cash / MilesToCashRate) ;
    }
}

public class RewardValue {
    private final double rate = 0.0035;
    double cash;
    int miles;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return this.cash;
    }


    public double getMilesValue(){
        return this.cash * (1.0/rate);
    }
    
}
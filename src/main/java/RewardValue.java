public class RewardValue {

    private double cash;
    private int miles;
    double RATIO = 0.0035;

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
        return this.cash * 0.0035;
    }
}

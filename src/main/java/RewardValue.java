public class RewardValue {

    private double cash;
    private int miles;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return cash * 0.0035;
    }
}

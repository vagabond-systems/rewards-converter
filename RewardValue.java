public class RewardValue {
    private double cash;
    private int miles;
    RewardValue(double cash){
        this.cash = cash;
    }
    RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return miles * 0.0035;
    }

    public double getMilesValue(){
        return cash/0.0035;
    }

}

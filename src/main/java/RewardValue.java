public class RewardValue {
    private double cash;
    private double miles;
    RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) cash / .0035;
    }

    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * .0035;
    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}

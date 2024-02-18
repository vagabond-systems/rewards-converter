public class RewardValue {
    private double cash;
    private int miles;

    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

    double getCashValue(){
        return cash;
    }

    double getMilesValue(){
        return cash/0.0035;
    }

}

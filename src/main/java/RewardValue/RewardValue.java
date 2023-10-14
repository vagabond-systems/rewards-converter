package RewardValue;

public class RewardValue {
    double cash;
//    double miles;
    public RewardValue(double cashValue) {
        cash = cashValue;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue() {
        return cash*0.0035;
    }
}

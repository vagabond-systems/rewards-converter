public class RewardValue {
    final double CONVERSION_RATE = 0.0035;
    double cash;

    RewardValue(double cashValue){
        cash = cashValue;
    }

    RewardValue(int milesValue){
        cash = milesValue * CONVERSION_RATE;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return (int)(cash / CONVERSION_RATE);
    }
}

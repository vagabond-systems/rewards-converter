public class RewardValue {
    double x = 0.0035;
    double y = 1 - x;
    public RewardValue(double cashValue){
    }

    public double getCashValue(int args){
        return args * x;
    }
    public double getMilesValue(double args){
        return args * y;
    }
}

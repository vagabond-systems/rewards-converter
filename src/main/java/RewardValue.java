public class RewardValue {
    double cashValue;
    double milesValue;
    public RewardValue(double cv){
        cashValue = cv;
        milesValue = cv / 0.0035;
    }
    public RewardValue(int m){
        milesValue = m;
        cashValue = milesValue * 0.0035;
    }
    public double getMilesValue(){
        return milesValue;
    }

    public double getCashValue(){
        return cashValue;
    }
}

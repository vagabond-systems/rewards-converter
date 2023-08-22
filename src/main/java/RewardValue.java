public class RewardValue {
    private double cashValue;
    private int milesValue;

    RewardValue(double cash){
        cashValue = cash;
    }

    RewardValue(int miles){
        milesValue = miles;
    }

    public double getCashValue(){
        //returns the cash value of the RewardValue
        return milesValue / 0.0035;
    }

    public int getMilesValue(){
        //returns how many miles the RewardValue is worth
        return (int) (cashValue * 0.0035);
    }

}

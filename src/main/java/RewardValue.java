public class RewardValue {
    double cashValue;
    double milesValue;

    public RewardValue(double cash){
        cashValue = cash;
        milesValue = (cashValue * .0035);
    }

    public RewardValue(int miles){
        milesValue = miles;
        cashValue = (milesValue / .0035);
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }



}

public class RewardValue {

    double cashValue;
    int milesValue;

    // Takes cash and returns miles value at a rate of 285.71 (the reciprocal of 0.0035)
    public int getMilesValue(int cashValue){

        milesValue = (int) (cashValue * 285.71);

        return milesValue;
    }

    // Takes miles and returns cash value at a rate of 0.0035
    public double getCashValue(double milesValue){
        cashValue = milesValue * 0.0035;

        return cashValue;
    }
}

public class RewardValue {

    double exchangeRate = 0.0035;

    // Takes cash and returns miles value at a rate of 285.71 (the reciprocal of 0.0035)
    public int getMilesValue(int cashValue){

       int milesValue = (int) (cashValue / exchangeRate);

        return milesValue;
    }

    // Takes miles and returns cash value at a rate of 0.0035
    public double getCashValue(double milesValue){
        double cashValue = milesValue * exchangeRate;

        return cashValue;
    }
}

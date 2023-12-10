public class RewardValue {
    //Miles to cash converts at a rate of 0.0035
    double cashValue = 0.00;
    int milesValue = 0;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue * 0.0035);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    //Return cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    //Return how many miles RewardValue is worth
    public int getMilesValue() {
        return milesValue;
    }
}

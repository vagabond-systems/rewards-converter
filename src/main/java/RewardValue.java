//Must have two constructors
public class RewardValue {
    //One that accepts cash value
    private final double cashValue;
    //One that accepts miles value
    private final int milesValue;

    //Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    //Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    //Method to get cash value
    public double getCashValue() {
        return cashValue;
    }
    //Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }
}


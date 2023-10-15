
public class RewardValue {
    double cashValue;
     int  milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue =(int)(cashValue *0.0035);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int  milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue /0.0035;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public int  getMilesValue() {

        return milesValue;
    }
}


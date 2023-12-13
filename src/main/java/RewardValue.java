
public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Method to convert miles to cash
    private double convertToCash(int miles) {
        return miles * 0.0035;
    }

    // Method to convert cash to miles
    private int convertToMiles(double cash) {
        //right now its either cash / 0.0035 and the 2 test case doesnt work or just cash and the last 2 test cases dont work
        return (int) (cash /0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }
}


public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    //cash value
    public RewardValue(double CashValue) {
        this.cashValue = CashValue;
        this.milesValue = convertToCash((int) cashValue);
    }
    //miles value
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = convertToMiles(miles) ;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    //get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }
    // miles value rate
    public double getMilesValue() {
        return milesValue;
    }
    //commit & push

}



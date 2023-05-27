public class RewardValue {
    private static double cashValue;
    private static double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static double getconvertcashtomiles(double cashvalue){
        // double milesValue = 
          return cashValue / 0.0035; 
    }

    public static double getconvertmilestocash(double milesValue){
        double cashValue = milesValue * 0.0035;
          return cashValue;
    }
}

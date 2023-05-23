import static java.lang.Math.round;

public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    public int convertFromCashToMiles() {
        return (int) (this.cashValue * 0.0035);
    }

   public double convertFromMilesToCash() {
    return Math.round(this.milesValue / 0.0035 * 100) / 100.0;
}

}

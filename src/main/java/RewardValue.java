public class RewardValue {
    private double cashValue;
    private final int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = 0;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = 0.0;
    }

    public double getCashValue() {
      if (this.cashValue == 0.0) {
            this.cashValue = this.milesValue * 0.0035;
      }
      return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

}

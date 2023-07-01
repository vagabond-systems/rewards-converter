public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double conversion = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cashValue / conversion;
    }
    public RewardValue(int miles){
      this.milesValue = miles;
      this.cashValue = milesValue * conversion;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }


}

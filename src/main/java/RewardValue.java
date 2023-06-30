class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double value) {
        this.cashValue = value;
        this.milesValue = value * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

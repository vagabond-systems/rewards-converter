class RewardValue extends RewardsConverter {
    public int miles;
    public double cash;

    RewardValue(int milesValue) {
    this.miles = milesValue;

    }

    RewardValue(double cashValue) {
        this.cash = cashValue;
    }


    public double getCashValue() {
        return miles * 0.0035;
    }

    public int getMilesValue() {
        Double milesDouble = new Double(cash/0.0035);
        return milesDouble.intValue();
    }
}

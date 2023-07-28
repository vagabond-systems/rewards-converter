public class RewardValue {
    private Double cash_value;
    private Float miles_value;

    public RewardValue(Double c) {
        this.cash_value = c;
        this.miles_value = (float) (c / 0.0035);
    }
    public RewardValue(Float m) {
        this.miles_value = m;
        this.cash_value = m * 0.0035;

    }
    public Double getCashValue() {
        return this.cash_value;
    }
    public Float getMilesValue() {
        return this.miles_value;
    }
}

public class RewardValue {
    double milesCashConversionRate = 0.0035;
    double value;

    public RewardValue(double value) {
        this.value = value;
    }
    public double getCashValue() {
        return this.value*this.milesCashConversionRate;
    }

    public double getMilesValue() {
        return this.value/this.milesCashConversionRate;
    }
}

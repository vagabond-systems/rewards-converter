package RewardsConverter;

public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private final double conversionRate;

    public RewardValue(double cashValue, double conversionRate) {
        this.cashValue = cashValue;
        this.conversionRate = conversionRate;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double convertCashToMiles(double cash) {
        return cash * conversionRate;
    }

    public double convertMilesToCash(double miles) {
        return miles / conversionRate;
    }
}

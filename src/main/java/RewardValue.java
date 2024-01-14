public class RewardValue {
    double cashValue;
    int milesValue;
    double miles_to_cash_conversion_unit = 0.0035;

    public RewardValue (double cash) {
        this.cashValue = cash;
    }
    public RewardValue (int miles) {
        this.milesValue = miles;
    }

    public int cash_to_miles() {
        double milesResult = cashValue / miles_to_cash_conversion_unit;
        return (int) milesResult;
    }

    public double miles_to_cash() {
        return milesValue * miles_to_cash_conversion_unit;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}
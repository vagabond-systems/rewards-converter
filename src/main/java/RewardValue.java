public class RewardValue {

    /**
     * rate cash to miles
     */
    public static final double rateCashToMiles = 0.5;
    /**
     * rate miles to cash
     */
    public static final double rateMilesToCash = 0.2;
    /**
     * cash value
     */
    double cashValue;
    /**
     * miles value
     */
    int milesValue;

    /**
     * @param cashValue
     */
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    /**
     * @return int
     */
    public int getMilesValue() {
        Double v = convertFromCashToMiles();
        return milesValue;
    }

    /**
     * @param milesValue
     */
    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }

    /**
     * @return double
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     * @param cashValue
     */
    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    /**
     * This method allows to convert cash to miles and rate cashToMiles that is defined as 0.5
     *
     * @return double
     */
    public double convertFromCashToMiles() {
        return this.cashValue * rateCashToMiles;
    }

    /**
     * This method allows to convert miles to cash and rate milesToCash that is defined as 0.2
     *
     * @return double
     */
    public double convertFromMilesToCash() {
        return this.milesValue * rateMilesToCash;
    }
}

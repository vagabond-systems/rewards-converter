public class RewardValue {

    /**
     * rate cash to miles
     */
    public static final double RATE_CASH_TO_MILES = 0.0035;
    /**
     * rate miles to cash
     */
    public static final double RATE_MILES_TO_CASH = 0.0035;
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
        this.cashValue = convertFromMilesToCash();
    }

    /**
     * @return int
     */
    public int getMilesValue() {
       return convertFromCashToMiles();
    }

    /**
     *
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
    public int convertFromCashToMiles() {
        int miles = (int) (this.cashValue / RATE_CASH_TO_MILES);
        return miles;
    }

    /**
     * This method allows to convert miles to cash and rate milesToCash that is defined as 0.2
     *
     * @return double
     */
    public double convertFromMilesToCash() {
        return this.milesValue * RATE_MILES_TO_CASH;
    }
}

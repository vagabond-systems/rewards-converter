public class RewardValue {
    private double cashValue;
    private double conversion = 0.0035;

    /**
     * Constructor
     * Takes in user input
     * @param cashValue
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    /**
     * Constructor
     * Takes cash value variable and sets it to convert to cash method
     * @param milesValue
     */
    public RewardValue(int milesValue) {
        cashValue = convertToCash(milesValue);
    }

    /**
     * converts miles to cash
     * @return
     */
    public double convertToCash(int milesValue){
       return Math.round(milesValue * conversion);
    }

    /**
     * converts cash to miles
     * @return
     */
    public int convertToMiles(double cashValue){
        return (int)Math.round(cashValue / conversion);
    }


    /**
     * Getter
     * @return
     */
    public double getCashValue() {
        return cashValue;
    }


    /**
     * Getter
     * calls convertToMiles method using the current cash value and returns the result
     * @return 
     */
    public int getMilesValue() {
        return convertToMiles(cashValue);
    }


}

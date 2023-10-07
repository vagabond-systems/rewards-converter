public class RewardValue {

    private final double cashValue;

    public static final double MILES_TO_CASH_RATE = 0.0035;


    public static int convertToMiles(double cashEntered){
        return (int) (cashEntered / MILES_TO_CASH_RATE); // helper for cash to miles conversion
    }
    public static double convertToCash(int milesEntered){
        return  (milesEntered * MILES_TO_CASH_RATE); //helper for miles to cash conversion
    }

    RewardValue(double cash){
        this.cashValue = cash;
    }

    RewardValue(int miles){
        this.cashValue = convertToCash(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

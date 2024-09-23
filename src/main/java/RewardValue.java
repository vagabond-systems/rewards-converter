public class RewardValue {
    private Double cash;
    private Integer miles;

    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0000035;
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;

    }
    Double getCashValue(){
        if (cash != null) {
            return cash;
        } else if (miles != null) {
            // Convert miles to cash
            return miles * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            return -1.00; // Handle error case
        }
    }
    int getMilesValue() {
        if (miles != null) {
            return miles;
        } else if (cash != null) {
            // Convert cash to miles
            return (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
        } else {
            return -1; // Handle error case
        }
    }

}
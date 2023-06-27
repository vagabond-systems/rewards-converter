

public class RewardValue {
    private final double cash;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash=cash;
    }

    public RewardValue(int miles) {
        this.cash=convert_to_cash(miles);
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return convert_to_miles(this.cash);
    }

    public static int convert_to_miles(double cash){
        return (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
    }


    public static double convert_to_cash(int miles){
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }


}

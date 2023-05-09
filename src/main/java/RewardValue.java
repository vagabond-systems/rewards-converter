public class RewardValue {

    private double cash;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = convertCash(miles);
    }

    public double getCashValue(){
        // returns the cash value of RewardsValue
        return cash;
    }

    public double getMilesValue(){
        // returns the miles value of RewardsValue
        return convertMiles(this.cash);
    }

    private static int convertMiles(double cash){
        return (int) (cash / CONVERSION_RATE);
    }

    private static double convertCash(int miles){
        return miles * CONVERSION_RATE;
    }

}

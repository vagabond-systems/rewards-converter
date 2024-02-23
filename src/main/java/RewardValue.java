public class RewardValue {

    private final double cash;
    public static final double CONVERSION_MILES_CASH = 0.035;


    public RewardValue(double cash) {
        this.cash = cash;
    }


    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    private static int convertToMiles( double cash){
        return (int) (cash / CONVERSION_MILES_CASH);
    }

    private static double convertToCash(int miles){
        return miles * CONVERSION_MILES_CASH;
    }


    public double getCashValue(){
        return cash;
    }


    public double getMilesValue() {
        return convertToMiles(this.cash);
    }

}

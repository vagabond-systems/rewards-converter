public class RewardValue {
    private double cash;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = convertToCash(miles);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return convertToMiles(this.cash);
    }
}

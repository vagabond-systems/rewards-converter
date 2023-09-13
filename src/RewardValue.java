public class RewardValue{
    private final double cash;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cash) { this.cash = cash; }
    public RewardValue(int miles) { this.cash = convertToCash(miles); }
    public double getCashValue() { return cash; }
    public int getMilesValue() { return convertToMiles(this.cash); }
    private static int convertToMiles(double cash) { return (int) (cash / MILES_TO_CASH_CONVERSION_RATE); }
    private static double convertToCash(int miles) {return miles * MILES_TO_CASH_CONVERSION_RATE; }
}

public class RewardValue {
    private final double cashValue;
    public static final double exchangeRate = 0.0035;

    public RewardValue(double cashValue){

        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){

        this.cashValue = conversionToCash(milesValue);
    }
    private static int conversionToMiles(double cashValue){

        return  (int) (cashValue / exchangeRate);
    }

    private static double conversionToCash(int milesValue){

        return milesValue * exchangeRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {

        return conversionToMiles(this.cashValue);
    }
}
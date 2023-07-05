public class RewardValue {
    private double cashValue;
    private int miles;
    private final double convertMilesToCash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = convertCashToMiles(cashValue);

    }

    public RewardValue(int miles) {
        this.cashValue = convertMilesToCash(miles);
        this.miles = miles;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
       return this.miles;
    }

    public int convertCashToMiles(double cashValue) {
        int convertedMiles = (int)(cashValue/convertMilesToCash);
        return convertedMiles;
    }

    public double convertMilesToCash(int miles){
        double convertedCash = miles * convertMilesToCash;
        return convertedCash;
    }

}

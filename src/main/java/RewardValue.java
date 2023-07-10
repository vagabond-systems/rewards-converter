public class RewardValue {

    private double cash;


    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cash = convertToCash(milesValue);
    }


    private static double convertToCash(int milesValue) {
        double result = milesValue * 0.0035;
        double roundResult = (double) Math.round(result * 100) / 100;

        return roundResult;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    public double getCashValue() { return this.cash; }

    public int getMilesValue() {
        return convertToMiles(this.cash);
    }


}

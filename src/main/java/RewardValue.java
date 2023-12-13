public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double aCashValue) {
        cashValue = aCashValue;
    }
    public RewardValue(int aMilesValue) {
        milesValue = aMilesValue;
    }
    public double getCashValue() {
        double milesToCash = milesValue*0.0035;
        double totalCashValue = cashValue + milesToCash;
        return totalCashValue;
    }

    public int getMilesValue() {
        int cashToMiles = (int)(cashValue/0.0035);
        int totalMilesValue = milesValue + cashToMiles;
        return totalMilesValue;
    }
}

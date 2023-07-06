public class RewardValue {

    private int cash;
    private int miles;

    public RewardValue(int cashValue, int milesValue) {

        this.cash = cashValue;
        this.miles = milesValue;
    }

    public double getCashValue() {
        double milesToCash = this.miles * 0.0035;
        return milesToCash;
    }

    public int getMilesValue() {
        int cashToMiles = (int) (this.cash / 0.0035) ;
        return cashToMiles;
    }




}

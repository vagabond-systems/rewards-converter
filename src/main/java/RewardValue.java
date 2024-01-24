public class RewardValue {

    private double cash;
    private double miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
        miles = cash / .0035;
    }

    public RewardValue(int milesValue) {
        this.miles = milesValue;
        cash = miles * .0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }



}

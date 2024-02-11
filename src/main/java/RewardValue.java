public class RewardValue {

    private double cash;
    private double miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles =  cashValue / 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles * .0035;
    }

}
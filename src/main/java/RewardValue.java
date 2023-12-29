public class RewardValue {

    private double cashValue;

    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);


    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
        this.milesValue = milesValue;
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / .0035);
    }

    public double convertToCash(int milesValue) {
        return milesValue * .0035;
    }

    public double getCashValue() {

        return cashValue;
    }

    public double getMilesValue() {

        return convertToMiles(this.cashValue);
    }
}

public class RewardValue {

    private final double cashValue;
    public static final double mileToCashRate = 0.0035;

    //two constructors: one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    //convert from miles to cash at a rate of 0.0035 (from mileToCashRate)
    private static double convertToCash(double milesValue){
        return milesValue * mileToCashRate;
    }

    //to find miles the RewardValue is worth.
    private static double cashToMile(double cashValue){
        return cashValue / mileToCashRate;
    }

    //getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue() {
        return cashValue;
    }

    //getMilesValue() method, which returns how many miles the RewardValue is worth
    public int getMilesValue() {
        return (int) cashToMile(this.cashValue);
    }

}

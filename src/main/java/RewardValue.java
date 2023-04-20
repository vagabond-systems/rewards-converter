public class RewardValue {
    private double cashValue;
    private static final double CONVERSION_RATE = 0.0035;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONVERSION_RATE);
    }
    
    //It's not possible to have multiple constructors with the same signature.
    //Although airline miles could be a type of currency, I had to use them as a value of type "int".
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = cashValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

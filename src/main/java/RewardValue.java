public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    
    //It's not possible to have multiple constructors with the same signature.
    //Although airline miles could be a type of currency, I had to use them as a value of type "int".
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = cashValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

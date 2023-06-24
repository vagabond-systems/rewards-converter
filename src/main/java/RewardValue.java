public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double exchangeRate = .0035;

    //constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        cashValue = milesValue * exchangeRate;
        return cashValue;
    }

    public int getMilesValue() {
        milesValue = (int)(cashValue / exchangeRate);
        return milesValue;
    }





}

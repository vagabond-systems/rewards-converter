public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double CONVERSION_RATE = 0.0035;

    //constructor method
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles();

    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash();
    }



    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    private int convertCashToMiles(){
        return (int)Math.round(cashValue / CONVERSION_RATE);
    }

    private double convertMilesToCash(){
        return milesValue * CONVERSION_RATE;
    }
}

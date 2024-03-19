
public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public static int convertCashToMiles(double cashValue){
        return (int) (cashValue/CONVERSION_RATE);
    }
    public static double convertMilesToCash(int milesValue){
        return 1.0* milesValue* CONVERSION_RATE;
    }
    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return convertCashToMiles(this.cashValue);
    }
}

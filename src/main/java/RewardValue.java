public class RewardValue {
    private final double CONVERSION_RATE=0.0035;
    private double  cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public  RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
        return milesValue / CONVERSION_RATE;
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue * CONVERSION_RATE);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(cashValue);
    }
}

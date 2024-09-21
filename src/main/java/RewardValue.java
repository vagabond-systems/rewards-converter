public class RewardValue {

    private double cashValue;
    private double milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = convertToCash(milesValue);
    }
    
    public double convertToCash(double milesValue){
        return cashValue = milesValue*MILES_TO_CASH_CONVERSION_RATE;
        
    }

    public int convertToMiles(double cashValue){
        return (int)(cashValue/MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

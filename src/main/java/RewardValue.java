public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue= cashValue;
    }

    public RewardValue(int milesValues){
        this.cashValue = convertToCash(milesValues);
    }


    public static int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}

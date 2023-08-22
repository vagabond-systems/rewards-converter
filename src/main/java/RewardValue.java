public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue/CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue){
        return milesValue * CONVERSION_RATE;
    }
    public double getCashValue(){
        //returns the cash value of the RewardValue
        return cashValue;
    }

    public int getMilesValue(){
        //returns how many miles the RewardValue is worth
        return convertToMiles(cashValue);
    }

}

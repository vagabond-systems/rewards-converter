public class RewardValue {

    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double milesValue;
    public RewardValue(double cashValue){

        this.cashValue=cashValue;
    }
    public RewardValue(int milesValue){

        this.cashValue=toCash(milesValue);
    }
    private static double toCash(int milesValue){

        return milesValue*0.0035;
    }
    private static int toMiles(double cashValue){

        return (int) (cashValue/0.0035);
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){

        return toMiles(cashValue);
    }



}

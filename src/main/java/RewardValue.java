
public class RewardValue {
    private final double cashValue;
    public static final double rate = 0.0035;

    private static int convertToMiles(double cashValue){
        return (int)(cashValue/rate);
    }

    private static double convertToCash(int milesValue){
        return milesValue*rate;
    }

    public  RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }



    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}


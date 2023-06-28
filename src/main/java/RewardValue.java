public class RewardValue {
    private final double cashValue;
    public static final double rate = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int miles){
        this.cashValue = convertToCash(miles);
    }

    public static double convertToCash(int miles){
        return miles*rate;
    }
    public static int convertToMiles(double cash){
        return (int)(cash/rate);
    }
    public double getCashValue(){
        return this.cashValue;
    }
    public int getMilesValue(){
        return convertToMiles(getCashValue());
    }
}

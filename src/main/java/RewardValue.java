public class RewardValue {
    private double cash;
    private int miles;
    public static final double CONVERSATION_RATE_MILES_TO_CASH=0.0035;
    public RewardValue(double cash) {
        this.cash= cash;
        convertCashToMiles();
    }
    public RewardValue(int miles) {
        this.miles=miles;
        convertMilesToCash();
    }
    public double getCashValue(){
        return this.cash;
    }
    public int getMilesValue(){
        return (int)this.miles;
    }
    public int convertCashToMiles(){
        this.miles= (int) (cash/CONVERSATION_RATE_MILES_TO_CASH);
        return this.miles;
    }
    public double convertMilesToCash(){
//        miles->cash at 0.0035 rate ; 1 mile= 0.0035 cash; 2 miles = 0.0035*2 cash ; cash= 0.0035 * miles and miles= cash/0.0035
        cash=CONVERSATION_RATE_MILES_TO_CASH* miles;
        return cash;
    }
}

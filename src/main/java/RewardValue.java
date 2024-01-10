public class RewardValue {
    private double cash;
    private double miles;
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
    public double getMilesValue(){
        return this.miles;
    }
    public double convertCashToMiles(){
        this.miles= cash/0.0035;
        return this.miles;
    }
    public double convertMilesToCash(){
//        miles->cash at 0.0035 rate ; 1 mile= 0.0035 cash; 2 miles = 0.0035*2 cash ; cash= 0.0035 * miles and miles= cash/0.0035
        cash=0.0035* miles;
        return cash;
    }
}

public class RewardValue {
    private double cashValue;
    public static final double Miles2Cash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convert2Cash(milesValue);
    }

    private static int convert2Miles(double cashValue){
        return (int)(cashValue/Miles2Cash);
    }

    private static double convert2Cash(int milesValue){
        return milesValue*Miles2Cash;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue(){
        return convert2Miles(this.cashValue);
    }
}

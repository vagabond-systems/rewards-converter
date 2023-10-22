public class RewardValue {
    double cashValue;
    public static final double milesToCash=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue=convertToCash(milesValue);
    }
    public double convertToCash(int milesValue){
        return milesValue*milesToCash;
    }
    public int convertToMiles(double cashValue){
        return (int) (cashValue/milesToCash);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}

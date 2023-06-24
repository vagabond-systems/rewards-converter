public class RewardValue {
    double cashValue;
    public RewardValue(double cv) {
        this.cashValue = cv;
    }
    public RewardValue(int ms) {
        this.cashValue = convertToCash(ms);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    private int convertToMiles(double c){
        int mile = (int)(c/0.0035);
        return mile;
    }

    private double convertToCash(int m){
        double cash = m*0.0035;
        return cash;
    }
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}

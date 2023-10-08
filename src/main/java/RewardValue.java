public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    public int convertToMiles(double cashValue){
        int miles=(int)(cashValue/0.0035);
        return miles;
    }

    public double convertToCash(int milesValue){
        double cash=milesValue*0.0035;
        return cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}

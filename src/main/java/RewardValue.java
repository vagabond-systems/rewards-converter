public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
       return milesValue*0.0035;
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue/0.0035);
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue(){
        return cashValue;
    }   
}

public class RewardValue {

    private double cashValue;
    private double milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertingToMiles(cashValue);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = convertingToCash(milesValue);
    }


    public double convertingToMiles(double cashValue){
        return  cashValue / 0.0035;
    }

    public double convertingToCash(double milesValue){
        return milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }


    public double getMilesValue() {
        return milesValue;
    }


}

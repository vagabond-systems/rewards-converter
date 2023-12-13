public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){

        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue){

        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    private double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }
    private int convertCashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }


    public double getCashValue(){

        return cashValue;
    }

    public int getMilesValue(){
        return (int) (cashValue / 0.0035);
    }
}

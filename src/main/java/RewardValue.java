public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public RewardValue (int milesValue){
        cashValue=convertToCash(milesValue);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(cashValue);
    }

    public double convertToCash(int milesValue){
        return cashValue =  (double)milesValue * 0.0035;
    }

    public int convertToMiles(double cashValue){
        return (int) (cashValue/0.0035);
    }
}

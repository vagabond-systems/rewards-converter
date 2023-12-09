public class RewardValue {
    private final double cashValue;
    final double milesValueConversion = 0.0035;
    private int miles;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }
    private int convertToMiles(double cashValue){
        return (int) (cashValue / milesValueConversion);
    }
    private double convertToCash(int milesValue){
        return milesValue * milesValueConversion;
    }
    public double getCashValue(){
       return cashValue;
    }
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }

}

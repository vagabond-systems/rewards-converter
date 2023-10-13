public class RewardValue {
    final double cashValue;
    final double rate = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }
    public int convertToMiles(double cashValue){
        return (int) (cashValue / rate);
    }
    public double convertToCash(int milesValue){
        return milesValue * rate;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}

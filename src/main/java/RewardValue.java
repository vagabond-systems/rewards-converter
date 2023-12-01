public class RewardValue {
   private double cashValue;
    private int mileValue;

    public RewardValue(double cashValue) {
      this.cashValue = cashValue;
    }

    public RewardValue(int mileValue){
        this.cashValue = convertMilesToCash(mileValue);
    }

    public double convertMilesToCash(int mileValue){
        return mileValue * 0.0035;
    }
    public int convertCashToMiles(double cashValue){
        return (int)(cashValue / 0.0035);
    }

    public double getCashValue(){
        return this.cashValue;
    }
    public double getMilesValue(){
        return convertCashToMiles(this.cashValue);
    }

}

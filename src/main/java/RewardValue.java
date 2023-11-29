public class RewardValue {
    public double cashValue;
    public int mileValue;

    public RewardValue(double cashValue) {
      this.cashValue = cashValue;
    }

    public RewardValue(int mileValue){
        this.mileValue = mileValue;
    }

    public double getCashValue(){
        return this.mileValue * 0.0035;
    }
    public double getMilesValue(){
        return this.cashValue * 0.35;
    }

}

public class RewardValue {
    public double cvalue;
    public int mvalue;
    public RewardValue(double cvalue) {
         this.cvalue = cvalue;
    }
    public RewardValue(int mvalue) {
         this.mvalue = mvalue;
    }
    public double getCashValue() {
        return cvalue;
    }
    public double getMilesValue() {
        return cvalue/0.0035;
    }
}

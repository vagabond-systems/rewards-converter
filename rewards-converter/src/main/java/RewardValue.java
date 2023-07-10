// creating the class of the RewardConverter
public class RewardValue {
    private double CashValue;
    private double MilesValue;


    // Constructor accepting CashValue
    public RewardValue(double cashValue) {
        this.CashValue=cashValue;
        this.MilesValue=cashValue/(0.0035);
    }

    // Constructor accepting MileValue
    public RewardValue(int MileValue) {
        this.MilesValue=MileValue;
        this.CashValue=MileValue*(0.0035);
    }
    public double getCashValue() {
        return CashValue;
    }

    public double getMilesValue() {
        return MilesValue;
    }


}

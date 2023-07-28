public class RewardValue {
    private double CashValue;
    private int MilesValue;

    
    public RewardValue (double CashValue) {
        this.CashValue = CashValue;
        this.MilesValue = (int) (CashValue / 0.0035);
    }

    public RewardValue (int MilesValue) {
        this.MilesValue = MilesValue;
        this.CashValue = MilesValue * 0.0035;
    }

    public Double getCashValue () {
        return CashValue;
    }

    public int getMilesValue () {
        return MilesValue;
    }
}
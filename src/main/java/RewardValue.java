public class RewardValue {
    private double CashValue;
    private double MilesValue;

    
    public RewardValue (double CashValue) {
        this.CashValue = CashValue;
        this.MilesValue = CashValue / 0.0035;
    }

    public RewardValue (float MilesValue) {
        this.MilesValue = MilesValue;
        this.CashValue = MilesValue * 0.0035;
    }

    public Double getCashValue () {
        return CashValue;
    }

    public Double getMilesValue () {
        return MilesValue;
    }
}
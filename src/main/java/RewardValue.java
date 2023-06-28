public class RewardValue {
    private double cashValue;
    private int miles;
    public RewardValue(double cashValue){
        this.cashValue =cashValue;
        this.miles= (int)(cashValue /0.0035);
    }
    public RewardValue(int miles){
        this.miles= miles;
        this.cashValue=(miles * 0.0035);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.miles;
    }
}

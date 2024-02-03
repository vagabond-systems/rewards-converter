public class RewardValue {
    private double cashValue;
    private int milesValue;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    RewardValue(int miles) {
        this.milesValue = miles;
    }

    int getMilesValue() {
        if (this.milesValue != 0 || this.cashValue == 0) {
            return this.milesValue;
        }
        return (int) (this.cashValue / 0.0035);
    }
    
    double getCashValue(){
        if (this.cashValue != 0 || this.milesValue == 0) {
            return this.cashValue;
        }
        return this.milesValue * 0.0035;
    }
    
}

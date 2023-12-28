public class RewardValue {
    double cashValue;
    int miles;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue / 0.0035);
    }

    RewardValue(int miles) {
        this.cashValue = miles * 0.0035;
        this.miles = miles;
    }

    double getCashValue() {
        return this.cashValue;
    }

    int getMilesValue() {
        return this.miles;
    }
}

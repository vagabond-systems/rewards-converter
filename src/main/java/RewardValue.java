public class RewardValue {

    double cashValue;
    static final double conversionRate = 0.0035;

    RewardValue(double cash) {
        cashValue = cash;
    }

    RewardValue(int miles) {
        cashValue = miles * conversionRate;
    }

    double getCashValue() {
        return cashValue;
    }

    int getMilesValue() {
        return (int) (cashValue / conversionRate);
    }
}

public class RewardValue {
    private final double cash;

    RewardValue(double cashValue) {
        cash = cashValue;
    }

    RewardValue(int miles) {
        cash = toMiles(miles);
    }

    private double toMiles(double cash) {
        double rate = 0.0035;
        return (int) (cash / rate);
    }

    int getMilesValue() {
        return (int) toMiles(cash);
    }

    double getCashValue() {
        return cash;
    }
}

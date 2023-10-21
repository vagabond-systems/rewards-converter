public class RewardValue {
    double cash;
    int miles;
    double EXCHANGE_RATE = 0.0035; // 1 mile = 0.0035 cash
    RewardValue(double cash) {
        this.cash = cash;
    }
    RewardValue(int miles) {
        this.miles = miles;
    }
    double getCashValue() {
        return this.cash;
    }
    double getMilesValue() {
        return this.miles;
    }
    double convert_from_miles_to_cash() {
        return this.miles * this.EXCHANGE_RATE;
    }
}

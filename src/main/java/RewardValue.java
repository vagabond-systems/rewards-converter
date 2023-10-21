public class RewardValue {
    double cash;
    final static double EXCHANGE_RATE = 0.0035; // 1 mile = 0.0035 cash
    RewardValue(double cash) {
        this.cash = cash;
    }
    RewardValue(int miles) {
        this.cash = convert_from_miles_to_cash(miles);
    }
    double getCashValue() {
        return this.cash;
    }
    double getMilesValue() {
        return convert_from_cash_to_miles(this.cash);
    }
    double convert_from_miles_to_cash(int miles) {
        return miles * RewardValue.EXCHANGE_RATE;
    }
    int convert_from_cash_to_miles(double cash) {
        return (int) (cash / RewardValue.EXCHANGE_RATE);
    }
}

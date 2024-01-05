public class RewardValue {
    private double miles;
    private double cash;

    public RewardValue (double cash) {
        this.cash = cash;

        this.miles = cash / 0.0035;
    }

    public RewardValue (int miles) {
        //tests input miles as int, so I am accepting it as an int
            this.miles = miles;

            this.cash = miles * 0.0035;

    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.miles;
    }
}

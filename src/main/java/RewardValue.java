public class RewardValue {

    private double cash;
    private double miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }



    public double getMilesValue() {
        if (this.cash != 0) {
            return this.cash * .0035;
        }
        return this.miles;
    }

    public double getCashValue() {
        if (this.miles != 0) {
            return this.miles / .0035;
        }
        return this.cash;
    }

}

public class RewardValue {

    double cash;
    int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles= (int)(cash/ 0.0035);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash= miles*0.0035;

    }

    double getCashValue() {
        return this.cash;
    }

    double getMilesValue() {
        return this.miles;
    }
}

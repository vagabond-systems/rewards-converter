
public class RewardValue {

    int cash = 0
    int miles = 0

    public RewardCash(int newCash) {
        this.cash = newCash
        this.miles = cash*0.0035
    }

    public RewardMiles(int newMiles) {
        this.miles = miles
        this.cash = miles/0.0035
    }

    static int getCashValue() {
        return this.cash
    }

    static int getMilesValue() {
        return this.miles
    }
}
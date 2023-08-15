public class RewardValue {

    double cash;
    double miles;
    RewardValue(double cash){
        this.cash = cash;
    }
    RewardValue(int miles){
        this.cash = miles * 0.0035;
    }

    double getCashValue() {
        return cash;
    }

    double getMilesValue() {
        return (int)(cash/0.0035);
    }
}

public class RewardValue {

    double cashValue;
    int milesValue;
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / 0.0035);
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    double getCashValue() {
        return cashValue;
    }

    int getMilesValue() {
        return milesValue;
    }


}

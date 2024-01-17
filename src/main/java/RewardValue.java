public class RewardValue {


    double cashValue;

    double milesValue;



    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035 ;
    }

    RewardValue(int  milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035 ;
    }

    double getCashValue() {
        return this.cashValue;

    }

    double  getMilesValue() {
        return this.milesValue;

    }

    public void convertFromCashToMiles() {
        this.milesValue = this.cashValue / 0.0035;
    }

    public void convertFromMilesToCash() {
        this.cashValue = this.milesValue * 0.0035;
    }
}

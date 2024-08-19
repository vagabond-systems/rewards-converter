public class RewardValue {
    double cashValue;
    double miles;

//    CONSTRUCTORS
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = cashValue / 0.0035;
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * 0.0035;
    }

//    GETTERS
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return miles;
    }
}

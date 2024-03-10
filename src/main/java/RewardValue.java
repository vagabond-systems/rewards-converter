public class RewardValue {

    double cashValue;
    public RewardValue(double cashValue) {

        this.cashValue = cashValue;


    }
    public double getMilesValue(){

        return this.cashValue * 0.0035;
    }
    public double getCashValue(){

        return this.cashValue ;
    }
}

public class RewardValue {
    double cashValue;
    int mileValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int mileValue){
        this.mileValue = mileValue;
    }

    public double getCashValue(){
        return mileValue * 0.0035;
    }

    public double getMilesValue(){
        return cashValue/0.0035;
    }

}

//RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//RewardValue must convert from miles to cash at a rate of 0.0035.
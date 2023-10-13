public class RewardValue {
    double cashValue;
    double mileValue;
    double mileConversionRate = 0.0035;


    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.mileValue = cashValue/mileConversionRate;
    }

    public RewardValue(int mileValue){

        this.mileValue = mileValue;
        this.cashValue = mileValue * mileConversionRate;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return mileValue;    }
}

//RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//RewardValue must convert from miles to cash at a rate of 0.0035.
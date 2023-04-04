public class RewardValue {

    private double rewardValue;
    private double ratio = 0.0035;
    public RewardValue(int miles){
        super();
        this.rewardValue = miles * ratio;
    }
    public RewardValue(Double cash){
        super();
        this.rewardValue = cash/ratio;
    }
    public RewardValue(){
        super();
    }
    public double getCashValue(){
        return this.rewardValue;
    }
    public double getMilesValue(){
        return this.rewardValue;
    }
    /**
     *
     *
     *
     * RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
     * RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
     * RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
     * RewardValue must convert from miles to cash at a rate of 0.0035.
     * **/
}

/*
This class is functions as a converter for miles and cash. I created two variables: cashValue and miles, and made them
private to not allow the users of RewardsConverter class to change the values. I also created two get methods that convert
cash to miles and miles to cash and providing the users the conversion.
 */
public class RewardValue {

    private double cashValue;
    private float miles;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(float miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return miles * 0.0035;
    }

    public float getMilesValue(){
        return (float) (cashValue / 0.0035);
    }

}


public class RewardValue {

    private double cashValue;
    private String mileValue;
    RewardValue(double value)
    {
        cashValue = value * 0.0035;
        mileValue = String.valueOf(cashValue);
    }
    RewardValue(String value)
    {
       mileValue = value;
       double temp;
       temp = Double.parseDouble(mileValue);
       cashValue = temp/0.0035;
    }

    public String getMilesValue() {
        return mileValue;
    }
     public double getCashValue() {
        return cashValue;
    }
}

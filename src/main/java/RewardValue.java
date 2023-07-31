
public class RewardValue {

    private double cashValue;
    private int mileValue;
    public  final double rate = 0.0035;
    RewardValue(double value)
    {
        cashValue = value;
    }
    RewardValue(int value)
    {
      mileValue = value;
    }

    public  int convertToMiles(double value)
    {
        return (int)(value/rate);
    }

    public int getMilesValue() {
     return mileValue;
    }
     public double getCashValue() {
        return cashValue;
    }

    public double convertToCash(int milevalue){

        return milevalue * rate;
    }
}
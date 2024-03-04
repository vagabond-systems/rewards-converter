public class RewardValue {
    private double cashValue;
    private int mileValue;
public RewardValue (double cashValue)
{
    this.cashValue = cashValue;
    this.mileValue = (int) (cashValue / 0.0035);
}
public RewardValue(int mileValue)
{
    this.mileValue = mileValue ;
    this.cashValue = mileValue * 0.0035 ;
}
public double getCashValue()
{
    return cashValue;
}
public int getMileValue()
{
    return mileValue;
}
public static void main(String[] args) {
    
    RewardValue reward1 = new RewardValue(100); 
    System.out.println("Cash Value: $" + reward1.getCashValue()); 
    System.out.println("Miles Value: " + reward1.getMileValue());

    RewardValue reward2 = new RewardValue(10.5);
    System.out.println("Cash Value: $" + reward2.getCashValue()); 
    System.out.println("Miles Value: " + reward2.getMileValue()); 
}
}

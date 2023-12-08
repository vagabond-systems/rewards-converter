public class RewardValue {
    private double cash;
    final double milesValue = 0.0035;
    private int miles;
    RewardValue(double cashValue){
        setCashValue(cashValue);

    }
    RewardValue(int miles){
        setMiles(miles);
    }
    public double getCashValue(){
       return miles/milesValue;
    }
    public int getMilesValue(){
        return (int)(cash*milesValue);
    }
    private void setCashValue(Double cashTemp){
        cash = cashTemp;
    }
    private void setMiles(int milesTemp){
        miles = milesTemp;
    }

}

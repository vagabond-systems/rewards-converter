public class RewardValue {
    private double cashValue;
    private int milesValue;

    //constructor that accepts cash
    public RewardValue(double cash){
        cashValue = cash;
        cashToMiles();
    }

    //constructor that accepts miles
    public RewardValue(int miles){
        milesValue = miles;
        milesToCash();
    }

    //returns how many miles the RewardValue is worth
    public int getMilesValue (){
        return milesValue;
    }

    //returns how much cash the RewardValue is worth
    public double getCashValue (){
        return cashValue;
    }

    //convert from miles to cash at a rate of 0.0035
    public void milesToCash(){
        cashValue = milesValue * 0.0035;
    }

    //converts from cash to miles
    public void cashToMiles(){
        milesValue = (int) (cashValue / 0.0035);
    }
}
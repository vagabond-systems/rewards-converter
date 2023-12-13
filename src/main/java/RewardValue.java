public class RewardValue {

    //conversion rate miles to cash
    public final double MILES_TO_CASH = 0.0035;

    private double cashValue;

    private int miles;

    //must have two constructors

    //constructor - 1 : accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    //constructor - 2 : accepts miles value
    public RewardValue(int miles){
        this.miles = miles;
    }

    //getCashValue method that returns the cash value
    public double getCashValue(){
        return cashValue;
    }

    //getMilesValue() method that returns how many miles
    public int getMilesValue(){
        int miles = (int)(cashValue * MILES_TO_CASH);
        return miles;
    }


}

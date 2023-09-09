package src;

public class RewardValue{
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public double cashValue;
    public int miles;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    RewardValue(int milesValue){
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        this.miles = milesValue;
    }

    public double getMilesValue(){
        return miles;
    }
    public double getCashValue(){
        return cashValue;
    }
}
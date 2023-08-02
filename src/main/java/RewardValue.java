import java.util.*;

public class RewardValue{
    double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue = convertMilesToCash(milesValue);
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return convertCashToMiles(this.cashValue);
    }

    public double convertMilesToCash(int milesValue){
        return milesValue * 0.0035;
    }
    public int convertCashToMiles(double cashValue){
        return (int)(cashValue / 0.0035);
    }
}
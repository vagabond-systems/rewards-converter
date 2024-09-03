import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double conversionRate = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversionRate ;
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue = milesValue * conversionRate;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
}

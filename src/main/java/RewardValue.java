import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double conversionRate = 0.0035;
    private int milesValue;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / this.conversionRate);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * this.conversionRate;
    }
    public double getMilesValue(){
        return this.milesValue;
    }
    public double getCashValue(){
        return this.cashValue;
    }
}

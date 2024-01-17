import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
    public double getMilesValue(){
        return this.milesValue;
    }
    public double getCashValue(){
        return this.cashValue;
    }
}

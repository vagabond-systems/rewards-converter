import java.math.BigDecimal;

public class RewardValue {
private double cashValue;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public RewardValue(int miles){
        this.cashValue = convertMilesToCash(miles);
    }

    public int convertCashToMiles(double cashValue){
        return (int) (cashValue/0.0035);
    }

    public double convertMilesToCash(int miles){
        return (double) (miles * 0.0035);
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return convertCashToMiles(this.cashValue);
    }
}

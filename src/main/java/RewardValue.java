import java.math.BigDecimal;

public class RewardValue {
private int miles;
private double cashValue;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        double cashValue = this.miles*0.0035;
        return cashValue;
    }

    public int getMilesValue(){
        int miles = (int)(this.cashValue/0.0035);
        return miles;
    }
}

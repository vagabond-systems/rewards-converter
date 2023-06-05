import java.math.BigDecimal;

public class RewardValue {
    private BigDecimal cash;
    private double miles;

    public RewardValue(BigDecimal cash) {
        this.cash = cash;
    }

    public RewardValue(double miles){
        this.miles = miles;
    }

    public double getMilesValue(){
        return 0;
    }

    public BigDecimal getCashValue(){
        return null;
    }
}

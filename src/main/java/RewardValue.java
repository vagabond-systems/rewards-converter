import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {
    
    private double cashValue;
    private float milesValue;
    public static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (float) (cashValue / MILES_TO_CASH_RATE);
    }

    public RewardValue(float milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {

        return cashValue;
    }

    public float getMilesValue() {

        return milesValue;
    }

}
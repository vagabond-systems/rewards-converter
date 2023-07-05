import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class RewardValue {
    private float milesValue;
    private double cashValue;

    public RewardValue(float milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (float) (cashValue * 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

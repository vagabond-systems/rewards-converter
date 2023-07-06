import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class RewardValue {
    private int milesValue;
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    public double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

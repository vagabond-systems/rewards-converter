import java.text.DecimalFormat;

public class RewardValue {
    private double rate = 0.0035;

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = getMilesValue();
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = getCashValue();
    }

    private double roundNearestSecondDecimal(double n) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(n));
    }

    public double getCashValue() {
        return roundNearestSecondDecimal(this.milesValue * rate);
    }

    public int getMilesValue() {
        return (int) Math.round(this.cashValue / rate);
    }
}

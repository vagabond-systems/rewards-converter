import java.text.DecimalFormat;

// rate is 0.0035

public class RewardValue {

    DecimalFormat df = new DecimalFormat("#.##");
    double cashValue;
    int milesValue;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        milesValue = (int) Math.floor(cashValue / 0.0035);
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = Double.parseDouble(df.format(milesValue * 0.0035));
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }


}

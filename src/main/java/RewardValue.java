import java.security.Principal;

public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue/MILES_TO_CASH_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    @Override
    public String toString() {
        return "RewardValue [cashValue=" + cashValue + ", milesValue=" + milesValue + "]";
    }
}

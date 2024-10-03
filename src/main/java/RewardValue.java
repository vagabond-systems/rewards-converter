public class RewardValue {
    private Double Cash = null;
    private Integer Miles = null;
    public static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double CashValue) {
        this.Cash = CashValue;
    }

    public RewardValue(int MilesValue) {
        this.Miles = MilesValue;
    }

    public double getCashValue() {
        if (Cash != null) {
            return Cash;
        }
        return MILES_TO_CASH * Miles;
    }

    public Integer getMilesValue() {
        if (Miles != null) {
            return Miles;
        }
        return (int) (1 / MILES_TO_CASH * Cash);
    }
}

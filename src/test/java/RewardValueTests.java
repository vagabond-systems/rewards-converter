import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    public class RewardValue {
        private double cashValue;
        private int milesValue;
        private static final double MILES_TO_CASH_RATIO = 0.0035;

        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = (int) Math.floor(cashValue / MILES_TO_CASH_RATIO);
        }

        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATIO;
        }

        public double getCashValue() {
            return cashValue;
        }

        public int getMilesValue() {
            return milesValue;
        }

        public void setCashValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = (int) Math.floor(cashValue / MILES_TO_CASH_RATIO);
        }

        public void setMilesValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATIO;
        }

        public static double getMilesToCashRatio() {
            return MILES_TO_CASH_RATIO;
        }

        public double convertMilesToCash(int miles) {
            return miles * MILES_TO_CASH_RATIO;
        }

        public int convertCashToMiles(double cash) {
            return (int) Math.floor(cash / MILES_TO_CASH_RATIO);
        }
    }

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 50.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(14285, rewardValue.convertCashToMiles(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(35, rewardValue.convertMilesToCash(milesValue), 0.01);
    }
}

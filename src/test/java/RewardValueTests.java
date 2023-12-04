import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

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
        double cashValue = 1000;
        var convertedValue = (int) (cashValue / (MILES_TO_CASH_CONVERSION_RATE));
        var rewardValue = new RewardValue(cashValue);
        assertEquals(convertedValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 500;
        var convertedValue = (double) miles * (MILES_TO_CASH_CONVERSION_RATE);
        var rewardValue = new RewardValue(miles);
        assertEquals(convertedValue, rewardValue.getCashValue());
    }
}

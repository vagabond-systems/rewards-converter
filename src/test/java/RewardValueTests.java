import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void testCreateWithMilesValue() {
        double milesValue = 10000.0;
        RewardValue rewardValue = new RewardValue(0.0, milesValue);
        double actualMilesValue = rewardValue.getMilesValue();

        // Using delta-based comparison to account for floating-point precision
        double delta = 0.0001;
        assertEquals(milesValue, actualMilesValue, delta);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        double expectedMilesValue = cashValue / 0.0035;

        RewardValue rewardValue = new RewardValue(cashValue);
        double actualMilesValue = rewardValue.getMilesValue();

        // Using delta-based comparison to account for floating-point precision
        double delta = 0.0001;
        assertEquals(expectedMilesValue, actualMilesValue, delta);
    }

    @Test
    void testMilesToCashConversion() {
        double milesValue = 5000.0;
        double expectedCashValue = milesValue * 0.0035;

        RewardValue rewardValue = new RewardValue(expectedCashValue);
        double actualCashValue = rewardValue.milesToCash(milesValue);

        // Using delta-based comparison to account for floating-point precision
        double delta = 0.001;
        assertEquals(expectedCashValue, actualCashValue, delta);
    }
}

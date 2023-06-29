import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

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
    public void testCashToMilesConversion() {
        double cashValue = 100.0;
        double expectedMilesValue = cashValue / 0.0035;

        RewardValue rewardValue = new RewardValue(cashValue);
        double actualMilesValue = rewardValue.getMilesValue();

        Assertions.assertEquals(expectedMilesValue, actualMilesValue, 0.0001); // Allowing a small delta for floating-point precision
    }

    @Test
    public void testMilesToCashConversion() {
        int milesValue = 500;
        double expectedCashValue = milesValue * 0.0035;

        RewardValue rewardValue = new RewardValue(milesValue);
        double actualCashValue = rewardValue.getCashValue();

        Assertions.assertEquals(expectedCashValue, actualCashValue, 0.01); // Allowing a small delta for floating-point precision
    }
}

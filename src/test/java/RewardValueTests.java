import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double DELTA = 1e-15;

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
        RewardValue reward = new RewardValue(100.0);
        double expectedMiles = 100.0 / RewardValue.CONVERSION_RATE;
        assertEquals(expectedMiles, reward.getMilesValue(), DELTA);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue reward = new RewardValue(1000);
        double expectedCash = 1000 * RewardValue.CONVERSION_RATE;
        assertEquals(expectedCash, reward.getCashValue(), DELTA);
    }

}

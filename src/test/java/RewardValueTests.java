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
    public void convert_from_cash_to_miles() {
        RewardValue reward = new RewardValue(100.0);
        int expectedMiles = 28571;  // 100.0 / 0.0035
        assertEquals(expectedMiles, reward.getMilesValue());
    }

    @Test
    public void convert_from_miles_to_cash() {
        RewardValue reward = new RewardValue(50000);
        double expectedCash = 175.0;  // 50000 * 0.0035
        assertEquals(expectedCash, reward.getCashValue(), 0.001);  // Allow for slight rounding errors
    }
}

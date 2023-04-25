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
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardValue reward = new RewardValue(cashValue);

        // Check that the miles value is correctly calculated
        int expectedMiles = (int) (100 / 0.0035);
        int actualMiles = reward.getMilesValue();
        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue reward = new RewardValue(milesValue);

        // Check that the cash value is correctly calculated
        double expectedCash = 10000 * 0.0035;
        double actualCash = reward.getCashValue();
        assertEquals(expectedCash, actualCash);
    }
}

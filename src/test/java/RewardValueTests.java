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
        double testCash = 350.00;
        // Calculate expected value without RewardValue functions (but using any constants on RewardValue)
        int expectedMiles = (int) (testCash / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        // Create RewardValue with test amount
        var rewardValue = new RewardValue(testCash);
        // Compare if both values are equal
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int testMiles = 40_000;
        // Calculate expected value without RewardValue functions (but using any constants on RewardValue)
        double expectedCash = testMiles * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        // Create RewardValue with test amount
        var rewardValue = new RewardValue(testMiles);
        // Compare if both values are equal
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

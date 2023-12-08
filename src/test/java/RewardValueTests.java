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

    /**
     * Test case to ensure the correct conversion from cash to miles in the RewardValue class.
     * It creates a RewardValue object with a specified cash value, calculates the expected miles
     * value based on the conversion rate, and checks if the actual miles value matches the expected value.
     *
     * @see RewardValue
     */
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200;
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue / RewardValue.VALUE_IN_MILES_RATE);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    /**
     * Test case to ensure the correct conversion from miles to cash in the RewardValue class.
     * It creates a RewardValue object with a specified miles value, calculates the expected cash
     * value based on the conversion rate, and checks if the actual cash value matches the expected value.
     *
     * @see RewardValue
     */
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * RewardValue.VALUE_IN_MILES_RATE;
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

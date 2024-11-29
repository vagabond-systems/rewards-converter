import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    // Test: Create RewardValue object with a cash value
    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    // Test: Create RewardValue object with a miles value
    @Test
    void create_with_miles_value() {
        double milesValue = 10000.0;
        var rewardValue = new RewardValue(milesValue, true);  // Miles constructor
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    // Test: Convert from cash to miles
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    // Test: Convert from miles to cash
    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 5000.0;
        var rewardValue = new RewardValue(milesValue, true);  // Miles constructor
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}


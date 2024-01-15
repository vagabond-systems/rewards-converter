import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    
    // Assuming these are the correct conversion rates from the RewardValue class
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 1 / MILES_TO_CASH_CONVERSION_RATE;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value did not match expected value.");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value did not match expected value.");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100; // Example cash value
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int)(cashValue * CASH_TO_MILES_CONVERSION_RATE);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), "Cash to miles conversion did not match expected value.");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // Example miles value
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01, "Miles to cash conversion did not match expected value.");
    }
}

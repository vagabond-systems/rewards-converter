import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    // Test for creating a RewardValue with cash
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    // Test for creating a RewardValue with miles
    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true); // Assume `true` signifies miles
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    // Test for converting from cash to miles
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0; // Example cash amount
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; // Conversion rate is 0.0035
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // Allowing a small delta
    }

    // Test for converting from miles to cash
    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000.0; // Example miles amount
        var rewardValue = new RewardValue(milesValue, true); // Assume `true` signifies miles
        double expectedCash = milesValue * 0.0035; // Conversion rate is 0.0035
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // Allowing a small delta
    }
}
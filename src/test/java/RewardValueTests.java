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
        var rewardValue = new RewardValue(cashValue);

        // Replace the placeholders with your actual conversion logic
        double expectedMiles = cashValue * 0.0035; // Placeholder, replace with your logic
        double actualMiles = rewardValue.getMilesValue();

        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);

        // Replace the placeholders with your actual conversion logic
        double expectedCash = milesValue / 0.0035; // Placeholder, replace with your logic
        double actualCash = rewardValue.getCashValue();

        assertEquals(expectedCash, actualCash);
    }
}

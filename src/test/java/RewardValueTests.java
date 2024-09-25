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
        double cashValue = 100; // Example cash value
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = Math.round(cashValue / RewardValue.getMilesConversionRate()); // Use the getter
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.001); // Check if the miles value is correct with a delta for double comparison
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // Example miles value
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * RewardValue.getMilesConversionRate(); // Use the getter
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001); // Check if the cash value is correct with a delta for double comparison
    }


}

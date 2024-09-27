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

        // Calculate expected miles using the conversion rate
        double expectedMilesValue = cashValue / RewardValue.MILES_TO_CASH_RATE;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // Example miles value
        var rewardValue = new RewardValue(milesValue);

        // Calculate expected cash using the conversion rate
        double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_RATE;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01);
    }
}

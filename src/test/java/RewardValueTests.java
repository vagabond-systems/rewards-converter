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

    // Test the ability of the RewardValue class to convert from cash to miles
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 250;
        int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    // Test the ability of the RewardValue class to convert from miles to cash
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 25000;
        double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

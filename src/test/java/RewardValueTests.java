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
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value should match");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), "Cash to miles conversion failed");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue(), "Miles to cash conversion failed");
    }
}

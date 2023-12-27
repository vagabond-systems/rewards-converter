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
        int expectedMiles = (int) (cashValue/RewardValue.RATE_CASH_TO_MILES);
        var rewardValue = new RewardValue(cashValue);
        int actualMiles = rewardValue.convertFromCashToMiles();
        assertEquals(expectedMiles, actualMiles );
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCash = milesValue * RewardValue.RATE_MILES_TO_CASH;
        var rewardValue = new RewardValue(milesValue);
        double actualCash = rewardValue.convertFromMilesToCash();
        assertEquals(expectedCash, actualCash );
    }
}

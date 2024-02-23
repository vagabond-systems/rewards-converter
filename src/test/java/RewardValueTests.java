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
        int estimatedMiles = (int) (cashValue / RewardValue.CONVERSION_MILES_CASH);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(estimatedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double estimatedCash = milesValue * RewardValue.CONVERSION_MILES_CASH;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(estimatedCash, rewardValue.getCashValue());
    }
}

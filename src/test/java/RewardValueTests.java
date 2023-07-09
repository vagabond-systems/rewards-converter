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
        double cashValue = 1234;
        var rewardValue = new RewardValue(cashValue);
        var expectedMiles = (int) (cashValue * rewardValue.CONVERSION_RATE);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 12345;
        var rewardValue = new RewardValue(milesValue);
        var expectedCash = (double) (milesValue / rewardValue.CONVERSION_RATE);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

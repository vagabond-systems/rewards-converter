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
        double cashValue = 100; // 100 units of cash
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; // Should be 28571.42857 miles for 100 units of cash
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // The delta (0.01) is to account for any floating-point imprecisions

    }

    @Test
    void convert_from_miles_to_cash() {
        long milesValue = 10000; // 10000 miles
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035; // Should be 35 units of cash for 10000 miles
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // The delta (0.01) is to account for any floating-point imprecisions
    }
}

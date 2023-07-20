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
        RewardValue rewardValue = new RewardValue(100.0);
        double expectedMilesValue = 5000.0;
        double actualMilesValue = rewardValue.getMilesValue();
        assertEquals(expectedMilesValue, actualMilesValue, 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(5000.0);
        double expectedcashValue = 100.0;
        double actualcashValue = rewardValue.getCashValue();
        assertEquals(expectedcashValue, actualcashValue, 0.001);
    }
}

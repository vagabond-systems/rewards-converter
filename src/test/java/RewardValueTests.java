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
        // GIVEN
        double cashValue = 100;
        // WHEN
        var rewardValue = new RewardValue(cashValue);
        // THEN
        assertEquals(cashValue * 0.0035, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        // GIVEN
        int milesValue = 10000;
        // WHEN
        var rewardValue = new RewardValue(milesValue);
        // THEN
        assertEquals(milesValue / 0.0035, rewardValue.getCashValue());
    }
}

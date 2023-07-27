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
        double milesValue = 500.0;
        RewardValue reward = new RewardValue(milesValue, true);
        assertEquals(milesValue, reward.getMilesValue(), 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 500.0;
        RewardValue reward = new RewardValue(milesValue, true);
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, reward.getCashValue(), 0.001);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        RewardValue reward = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        assertEquals(expectedMilesValue, reward.getMilesValue(), 0.001);
    }
}

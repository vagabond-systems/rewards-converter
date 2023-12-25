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
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Create a RewardValue instance with a cash value
        RewardValue reward = new RewardValue(100.0);

        // Check if the conversion from cash to miles is correct
        assertEquals(28571.428571428572, reward.getMilesValue(), 0.0001);
    }

    @Test
    void convert_from_miles_to_cash() {
        // Create a RewardValue instance with a miles value
        RewardValue reward = new RewardValue(5000.0, true);

        // Check if the conversion from miles to cash is correct
        assertEquals(17.5, reward.getCashValue(), 0.0001);
    }
}

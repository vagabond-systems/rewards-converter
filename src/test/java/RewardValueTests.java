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
        // Create a RewardValue object with a cash value of $10
        RewardValue rewardValue = new RewardValue(10.0);

        // Verify that the cash value is correct
        assertEquals(10.0, rewardValue.getCashValue(), 0.01);

        // Verify that the miles value is correct
        assertEquals(2857, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(10000);

        // Verify that the miles value is correct
        assertEquals(10000, rewardValue.getMilesValue());

        // Verify that the cash value is correct
        assertEquals(35.0, rewardValue.getCashValue(), 0.01);
    }
}

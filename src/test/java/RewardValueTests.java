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
        int rightValue = 18714;
        var rewardValue = new RewardValue(65.5);
        assertEquals(rightValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double rightValue = 65.5;
        var rewardValue = new RewardValue(18714);
        assertEquals(rightValue, rewardValue.getCashValue(), 0.1);
    }
}

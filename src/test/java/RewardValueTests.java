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
        double input_cash = 35;
        double expected_miles = 10000;
        var rewardValue = new RewardValue(input_cash);
        assertEquals(expected_miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int input_miles = 10000;
        double expected_cash = 35;
        var rewardValue = new RewardValue(input_miles);
        assertEquals(expected_cash, rewardValue.getCashValue());
    }
}

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
    void convert_from_cash_to_miles()
    {
        double cash = 1000.00;
        var reward = new RewardValue(cash);
        assertEquals(285714, reward.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash()
    {
        var miles = 28571;
        var reward = new RewardValue(miles);
        assertEquals(99.9985, reward.getCashValue());
    }
}

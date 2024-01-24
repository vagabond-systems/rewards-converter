import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// getting errors, but not sure how to pass because it always asserts to false?

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
        double cash = 35;
        var rewardValue = new RewardValue(cash);
        assertEquals(10000, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        var rewardValue = new RewardValue(miles);
        assertEquals(35, rewardValue.getCashValue());
    }
}

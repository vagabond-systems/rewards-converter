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
        int milesValue = 10000;
        RewardValue rv = new RewardValue(milesValue);
        assertEquals(35, rv.getCashValue(), 0.0001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 700;
        RewardValue rv = new RewardValue(cashValue);
        assertEquals(200000, rv.getMilesValue());

    }
}

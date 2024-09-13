import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.00;
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
        double cashvalue = 10000.50;
        var rewardValue = new RewardValue(cashvalue);
        assertEquals(cashvalue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesvalue = 100;
        var rewardValue = new RewardValue(milesvalue);
        assertEquals(milesvalue, rewardValue.getMilesValue());
    }
}

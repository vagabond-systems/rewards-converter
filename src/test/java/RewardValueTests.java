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
        double cashValue = 144;
        var rewardValue = new RewardValue(cashValue);
        int expectations = (int) (cashValue/0.0035);
        assertEquals(expectations, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 12;
        var rewardValue = new RewardValue(milesValue);
        double expectations = 0.0035 * milesValue;
        assertEquals(expectations, rewardValue.getCashValue());

    }
}

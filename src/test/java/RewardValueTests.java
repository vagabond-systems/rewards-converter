import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private final double RATE = 0.0035f;

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
        double cashValue = 200;
        var testValue = new RewardValue(cashValue);
        double expectValue = cashValue / RATE;
        assertEquals(expectValue, testValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 12345;
        var testValue = new RewardValue(milesValue);
        double expectValue = milesValue * RATE;
        assertEquals(expectValue, testValue.getCashValue());
    }
}

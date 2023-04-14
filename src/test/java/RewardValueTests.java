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
        double cashValue = 100;
        int milesValue = 28571;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 100.00;
        int milesValue = 28571;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles_when_input_is_100_point_75() {
        double cashValue = 100.75;
        int milesValue = 28786;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash_when_input_is_28786() {
        double cashValue = 100.75;
        int milesValue = 28786;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles_when_input_is_0() {
        double cashValue = 0;
        int milesValue = 0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash_when_input_is_0() {
        double cashValue = 0;
        int milesValue = 0;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }
}

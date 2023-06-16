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
        int milesValue = 28282;
        double cashValue = 98.99;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles_even() {
        double cashValue = 100.00;
        int milesValue = 28571;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles_even2() {
        double cashValue = 100.00;
        var rewardValue = new RewardValue(cashValue);
        int milesValue = (int) (cashValue / .0035);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 98.99;
        int milesValue = 28282;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_miles_to_cash_even() {
        int milesValue = 28571;
        double cashValue = 100.00;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_miles_to_cash_even2() {
        int milesValue = 28571;
        var rewardValue = new RewardValue(milesValue);
        double cashValue = Math.round(milesValue * .0035);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

}

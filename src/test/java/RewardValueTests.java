import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        var rewardValue = new main.java.RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double milesValue = 10000;
        var rewardValue = new main.java.RewardValue(milesValue, true); // Convert miles to cash
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
        double cashValue = 100;
        var rewardValue = new main.java.RewardValue(cashValue);
        assertEquals(cashValue * 3500, rewardValue.convertCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        double milesValue = 10000;
        var rewardValue = new main.java.RewardValue(milesValue, true); // Convert miles to cash
        assertEquals(milesValue / 3500, rewardValue.convertMilesToCash());
    }
}
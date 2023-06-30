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
        double initialCashValue = 100;
        var rewardValue = new RewardValue(initialCashValue);
        int milesValue = rewardValue.getMilesValue();
        double testCashValue = Math.round(milesValue*0.0035);
        assertEquals(initialCashValue, testCashValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int initialMilesValue = 10000;
        var rewardValue = new RewardValue(initialMilesValue);
        double cashValue = rewardValue.getCashValue();
        double testMilesValue = cashValue/0.0035;
        assertEquals(initialMilesValue, testMilesValue);
    }
}
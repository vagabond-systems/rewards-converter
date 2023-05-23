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
        double cashValue = 100;
        double conversionRate = 0.0035;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue * conversionRate;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double conversionRate = 0.0035;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue * conversionRate;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue;
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
        double cashValue = 100.00;
        double expectedMilesValue = cashValue / 0.0035;

        var rewardValue = new RewardValue(cashValue);
        double actualMilesValue = rewardValue.getMilesValue();

        assertEquals(expectedMilesValue, actualMilesValue);

    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * 0.0035;

        var rewardValue = new RewardValue(milesValue);
        double actualCashValue = rewardValue.getCashValue();

        assertEquals(expectedCashValue, actualCashValue);
    }
}

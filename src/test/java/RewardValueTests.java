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
        int conversionRate = (int) (5000 * .0035);
        var rewardValue = new RewardValue(5000.00);
        assertEquals(conversionRate, rewardValue.convertCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        double conversionRate = (double) (10000 / .0035);
        var rewardValue = new RewardValue(10000);
        assertEquals(conversionRate, rewardValue.convertMilesToCash());
    }
}

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
        int milesValue = 500;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.valueMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 200;
        double conversionRate = 0.0035;
        var rewardValue = new RewardValue(miles);
        double expectedCashValue = miles / conversionRate;
        assertEquals(expectedCashValue, rewardValue.getCashValue());
        assertEquals(miles, rewardValue.getMilesValue());
    }
}

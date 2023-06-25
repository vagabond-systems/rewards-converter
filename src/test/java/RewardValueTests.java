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
        double conversionRate = .0035;
        double cashValue = 500.00;
        RewardValue rewardValue = new RewardValue(cashValue);
        int milesValue = rewardValue.getMilesValue();
        int expectedMilesValue = (int) (cashValue / conversionRate);
        assertEquals(expectedMilesValue, milesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        double conversionRate = .0035;
        int milesValue = 100;
        RewardValue rewardValue = new RewardValue(milesValue);
        double cashValue = rewardValue.getCashValue();
        double expectedCashValue = milesValue * conversionRate;
        assertEquals(expectedCashValue, cashValue);
    }
}

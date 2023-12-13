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
        boolean isMiles = true;
        var rewardValue = new RewardValue(milesValue, isMiles);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_to_miles() {
        double cashValue = 200;
        double conversionRate = 0.0035;
        int expectedMilesValue = (int) (cashValue * (1 / conversionRate) );
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_to_cash() {
        int milesValue = 20000;
        boolean isMiles = true;
        double expectedCashValue = milesValue * 0.0035 ;
        var rewardValue = new RewardValue(milesValue, isMiles);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

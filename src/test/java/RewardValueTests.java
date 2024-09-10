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
        double cashvalue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashvalue * 285.71; // 1 dollar = 285.71 miles
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
    	 int milesValue = 10000;
         var rewardValue = new RewardValue(milesValue);
         double expectedCash = milesValue * 0.0035; // 1 mile = 0.0035 dollars
         assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

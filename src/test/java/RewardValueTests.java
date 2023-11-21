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
        var cashValue = 1.0;
        float expectedMiles = 0.0035F;

        var rewardValue = new RewardValue(cashValue);
        float actualMiles = rewardValue.getMilesValue();
        assertEquals(expectedMiles, actualMiles);


    }

    @Test
    void convert_from_miles_to_cash() {
        var miles = 0.003_5F;
        double expectedCash = 1.0 ;

        var rewardValue = new RewardValue(miles);
        double actualCash = rewardValue.getCashValue();
        assertEquals(expectedCash, actualCash);
    }
}

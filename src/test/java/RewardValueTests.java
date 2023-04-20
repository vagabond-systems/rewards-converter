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
        RewardValue rewardValue = new RewardValue(100.0);
        int expectedMiles = (int) ((int)100.0 / 0.0035);
        int actualMiles = rewardValue.getMilesValue();
        assertEquals(expectedMiles, actualMiles, 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(100); //assuming 1 mile per $10 conversion rate
        double expectedCash = 100*0.0035;
        double actualCash = rewardValue.getCashValue();
        assertEquals(expectedCash, actualCash, 0.01);
    }
}
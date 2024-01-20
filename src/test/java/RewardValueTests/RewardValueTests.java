package RewardValueTests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        RewardValue rewardValue = new RewardValue();
        double cashAmount = 100.0;
        double expectedMiles = 1000.0; // You need to replace this with the actual expected miles based on the conversion rate
        double delta = 0.001; // A small delta to account for floating-point precision issues

        double actualMiles = rewardValue.convertCashToMiles(cashAmount);

        assertEquals(1000.0, actualMiles, delta);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue();
        double miles = 1000.0;
        double expectedCash = 100.0; // You need to replace this with the actual expected cash based on the conversion rate
        double delta = 0.001;

        double actualCash = rewardValue.convertMilesToCash(miles);

        assertEquals(100.0, actualCash, delta);
    }
}

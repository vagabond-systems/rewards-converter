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
        double cashValue = 175;
        int cashToMiles = 50_000;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashToMiles, rewardValue.getCashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 25_000;
        double milesToCash = 87.5;
        var rewardValue = new RewardValue(miles);
        assertEquals(milesToCash, rewardValue.getMilesToCash());
    }
}

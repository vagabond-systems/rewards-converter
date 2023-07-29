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
        var rewardValue = new RewardValue(100);
        int milesFromCash = (int)(rewardValue.getCashValue() / RewardValue.rate);
        assertEquals(milesFromCash, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        var rewardValue = new RewardValue(10000);
        double cashFromMiles = rewardValue.getMilesValue() * RewardValue.rate;
        assertEquals(cashFromMiles, rewardValue.getCashValue());
    }
}

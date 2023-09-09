package src;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardsConverter.RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardsConverter.RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int milesValue = 28571;
        var rewardValue = new RewardsConverter.RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 99.9985;
        int milesValue = 28571;
        var rewardValue = new RewardsConverter.RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }
}

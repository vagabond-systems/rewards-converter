import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var RewardsValue = new RewardsValue(cashValue);
        assertEquals(cashValue, RewardsValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardsValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardsValue rewardValue = new RewardsValue(cashValue);
        assertEquals(cashValue/0.0035, rewardValue.getMilesValue());
        
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardsValue(milesValue);
        assertEquals(milesValue*0.0035, rewardValue.getCashValue());
    }
}


import org.junit.jupiter.api.*;

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
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, (rewardValue.getMilesValue())*rewardValue.rate);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000;
        var rewardValue = new RewardValue(cashValue);
        double milesValue = cashValue/(RewardValue.rate);
        assertEquals(milesValue,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        double cashValue = milesValue*(RewardValue.rate);
        assertEquals(cashValue, rewardValue.getCashValue()*rewardValue.rate);
    }
}
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
        RewardValue reward = new RewardValue(100.00);
        assertEquals(28571.42, reward.cashToMiles(), 0.01);

        RewardValue reward2 = new RewardValue(503.25);
        assertEquals(143785.71, reward2.cashToMiles(), 0.01);


        RewardValue reward3 = new RewardValue(74.00);
        assertEquals(21142.85, reward3.cashToMiles(), 0.01);
    }


    //Updated test to check new method
    @Test
    void convert_from_miles_to_cash() {
        RewardValue reward = new RewardValue(10000);
        assertEquals(35, reward.milesToCash(), 0.01);

        RewardValue reward2 = new RewardValue(3290101);
        assertEquals(11515.35, reward2.milesToCash(), 0.01);

        RewardValue reward3 = new RewardValue(74);
        assertEquals(0.25, reward3.milesToCash(), 0.01);
    }
}

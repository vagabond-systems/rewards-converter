import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
        double cashValue = 1500;
        double mil = cashValue*0.0035;
        int miles = (int)mil;
        var rewardsValue = new RewardValue(cashValue);

        assertEquals( miles, rewardsValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5;
        double cashValue = milesValue/0.0035;
        var rewardsValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardsValue.getCashValue(), 0.0001);
    }
}

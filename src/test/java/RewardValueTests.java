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
        double cashValue = 100;
        var rewardsValue = new RewardValue(cashValue);
        int milesValue = rewardsValue.cashToMile();
        System.out.println(milesValue);
        assertEquals(milesValue, 28571);
        rewardsValue = new RewardValue(milesValue);
        double test1 = rewardsValue.mileToCash();
        assertEquals(test1, 99.9985);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 28571;
        var rewardsValue = new RewardValue(milesValue);
        double cashValue = rewardsValue.mileToCash();
        assertEquals(cashValue, 99.9985);
    }
}

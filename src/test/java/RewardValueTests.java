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
       var cashvalue=10.0;
       var rewardsValue = new RewardValue(cashvalue);
       int testVal= (int) (cashvalue/0.0035);
       assertEquals((testVal),rewardsValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        var milesValue= 1000;
        double testVal= milesValue*0.0035;
        var rewardsValue= new RewardValue(milesValue);
        assertEquals(testVal,rewardsValue.getCashValue());
    }
}

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
      double cashValue = 20;
        var rewardValue  = new RewardValue(cashValue);
        assertEquals(5714.285714285714,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int mileValue = 5714;
        var rewardValue = new RewardValue(mileValue);
        assertEquals(19.999,rewardValue.getCashValue());
    }
}

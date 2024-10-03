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
        // assert false;
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int milesValue = rewardValue.getMilesValue();
        assertEquals(milesValue, (int) (cashValue / RewardValue.MILES_TO_CASH));
    }

    @Test
    void convert_from_miles_to_cash() {
        //assert false;
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        double cashValue = rewardValue.getCashValue();
        assertEquals(cashValue, milesValue * RewardValue.MILES_TO_CASH);
    }
}

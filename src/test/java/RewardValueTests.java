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

//    Found and compared the values expected to calculate
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 350;
        var rewardValue = new RewardValue(cashValue);
        double expectedValue = cashValue/0.0035;
        assertEquals(expectedValue,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue  = new RewardValue(milesValue);
        int expectedValue = (int) (milesValue * 0.0035);
        assertEquals(expectedValue,rewardValue.getCashValue());
    }
}

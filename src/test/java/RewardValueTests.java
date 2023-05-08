package test.java;

import main.java.RewardValue;
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
        double cashVal = 100;
        var rewardValue = new RewardValue(cashVal);
        int miles = (int) (cashVal / RewardValue.convRate);
        assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesVal = 100;
        var rewardValue = new RewardValue(milesVal);
        double cash = (milesVal * RewardValue.convRate);
        assertEquals(cash, rewardValue.getCashValue());
    }
}

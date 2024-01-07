
import RewardsConverter.java.RewardValue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;

        RewardValue rewardValue;
        rewardValue = new RewardValue(cashValue);

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

        double cash_to_miles_Value = 100;
        RewardValue rewardValue;
        rewardValue = new RewardValue(cash_to_miles_Value);
        assertEquals(cash_to_miles_Value, rewardValue.getCashValue());

    }

    @Test
    void convert_from_miles_to_cash() {

        int miles_to_cash_Value = 10000;
        var rewardValue = new RewardValue(miles_to_cash_Value);
        assertEquals(miles_to_cash_Value, rewardValue.getMilesValue());
    }
}
//End of testing

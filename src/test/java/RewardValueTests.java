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
        var rewardValue = new RewardValue(milesValue,true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double CONVERSION_RATE = 0.0035;
        double cashValue  = 1000.29;
        var rewardValue =  new RewardValue(cashValue);
        assertEquals(cashValue/CONVERSION_RATE,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double CONVERSION_RATE = 0.0035;
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue,true);
        assertEquals(milesValue*CONVERSION_RATE,rewardValue.getCashValue());
    }
}

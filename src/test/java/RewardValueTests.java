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
//      assert false;
        double cash = 100;
        int miles = 28571;
        var rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
//      assert false;
        int miles = 10000;
        double cash = 35.0;
        var rewardValue = new RewardValue(miles);
        assertEquals(cash, rewardValue.getCashValue());
    }

}

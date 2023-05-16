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
    void convert_from_cash_to_miles(){
        double cash = 90;
        var conv_obj = new RewardValue(cash);
        assertEquals(25714, conv_obj.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 123;
        var conv_obj = new RewardValue(miles);
        assertEquals(0.4305, conv_obj.getCashValue());
    }
}

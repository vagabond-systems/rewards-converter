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
        double cashValue = 10000;
        double miles = (float) cashValue * .0035;
        RewardValue milesValue = new RewardValue(cashValue);
        assertEquals(miles, milesValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        float milesValue = 10000;
        double cash = (double) milesValue / .0035;
        RewardValue cashValue = new RewardValue(milesValue);
        assertEquals(cash, cashValue.getCashValue());
    }
}

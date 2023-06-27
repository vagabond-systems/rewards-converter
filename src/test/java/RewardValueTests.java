import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCash());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMiles());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 100;
        double convertRate = 0.0035;
        RewardValue rv = new RewardValue(cash);
        int finalValue = (int) (cash / convertRate);
        assertEquals(finalValue, rv.getMilesValue(cash));
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 1000;
        double convertRate = 0.0035;
        RewardValue rv = new RewardValue(miles);
        double finalValue = miles * 0.0035;
        assertEquals(finalValue, rv.getCashValue());
    }


}

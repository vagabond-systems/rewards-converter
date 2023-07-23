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
         double v=0.0035;
        double actual_milesValue = rewardValue.getMilesValue();
        double e_milesValue = cashValue /v ;
        assertEquals(e_milesValue, actual_milesValue, 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double v1= 0.0035;
        double e_cashValue = milesValue * v1;
        double actualCashValue = rewardValue.getCashValue();
        assertEquals(e_cashValue, actualCashValue, 0.001);
    }
}

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
        assert false;
        double cashValue = 50;
        int resultMiles = (int)(cashValue/0.0035);
        var inMiles = new RewardValue(cashValue);
        assertEquals(resultMiles, inMiles.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        int milesValue = 5000;
        double resultCash = milesValue*0.0035;
        var inCash = new RewardValue(milesValue);
        assertEquals(resultCash, inCash.getCashValue());

    }
}

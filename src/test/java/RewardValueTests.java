import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

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
        int cashValue = 100;
        var milesValue = new RewardValue(cashValue);
        assertEquals(cashValue,milesValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValues = 2800;
        double cashValue = milesValues * 0.0035;
        var rewardValue = new RewardValue(milesValues);
        assertEquals(cashValue, rewardValue.convertToCash(milesValues));

    }

}

import org.junit.jupiter.api.Assertions;
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
        RewardValue test = new RewardValue(100.00);
        int results = test.cashToMilesConverter(test.getCashValue());
        Assertions.assertEquals(28571, results);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue test = new RewardValue(28571);
        double results = test.milesToCashConverter(test.getMilesValue());
        Assertions.assertEquals(99.99, results, .01);
    }
}

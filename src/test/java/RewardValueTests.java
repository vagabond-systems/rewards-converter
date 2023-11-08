import main.java.RewardValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue();
        rewardValue.setCashValue(cashValue);
        Assertions.assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue();
        rewardValue.setMilesValue(milesValue);
        Assertions.assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue();
        rewardValue.setCashValue(cashValue);
        double expectedMilesValue = cashValue * 0.0035;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var rewardValue = new RewardValue();
        rewardValue.setMilesValue(milesValue);
        double expectedCashValue = milesValue / 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private final double MILES_TO_CASH_RATE = 0.0035;
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 35;
        var reward = new RewardValue(cashValue);
        assertEquals(reward.getMilesValue(), cashValue/MILES_TO_CASH_RATE, String.format("$%s = %s miles.", cashValue, reward.getMilesValue()));
    }

    @Test
    void convert_from_miles_to_cash() {
        double mileValue = 10000;
        var reward = new RewardValue(mileValue, true);
        assertEquals(reward.getCashValue(), mileValue*MILES_TO_CASH_RATE, String.format("%s miles = $%s.", mileValue, reward.getCashValue()));
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
        assertEquals(cashValue * 0.0035, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.001);
        assertEquals(milesValue / 0.0035, rewardValue.getCashValue(), 0.001);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue * 0.0035;

        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue / 0.0035;

        assertEquals(expectedCash, rewardValue.getCashValue(), 0.001);
    }

    @Test
    void invalid_constructor_usage() {
        assertThrows(IllegalArgumentException.class, () -> new RewardValue(100, false));
    }
}

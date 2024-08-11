import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double TOLERANCE = 1e-2; // Tolerance for floating-point comparison
    private static final double CONVERSION_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), TOLERANCE);
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000.0;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), TOLERANCE);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        double expectedMilesValue = cashValue / CONVERSION_RATE;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), TOLERANCE);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000.0;
        double expectedCashValue = milesValue * CONVERSION_RATE;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(expectedCashValue, rewardValue.getCashValue(), TOLERANCE);
    }
}

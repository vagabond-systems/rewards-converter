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
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;  // Conversion from cash to miles
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001); // Allowing small delta for floating-point comparison
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035;  // Conversion from miles to cash
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.001); // Allowing small delta for floating-point comparison
    }
}
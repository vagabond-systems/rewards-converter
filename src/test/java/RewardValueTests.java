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
        double milesValue = 10000; // Example miles value
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.01); // Allow small tolerance
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100; // Example cash value
        double expectedMiles = cashValue / 0.0035; // Expected miles value
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // Allow small tolerance
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000; // Example miles value
        double expectedCash = milesValue * 0.0035; // Expected cash value
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // Allow small tolerance
    }
}

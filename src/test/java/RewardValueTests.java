import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035; // Example conversion rate

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
        double cashValue = 100; // Example cash value
        var rewardValue = new RewardValue(cashValue);
        
        // Expected miles = cashValue / conversion rate
        double expectedMiles = cashValue / MILES_TO_CASH_CONVERSION_RATE;
        
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // Allow slight precision difference
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // Example miles value
        var rewardValue = new RewardValue(milesValue);
        
        // Expected cash = milesValue * conversion rate
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // Allow slight precision difference
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    public void testConvertCashToMiles() {
        // Create a RewardValue with a cash value of $100
        RewardValue rewardValue = new RewardValue(100.0);
        
        // Check if the miles value is correctly converted
        // 100 cash should be equivalent to 28571.43 miles (100 / 0.0035)
        double expectedMiles = 100.0 / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // Allowing small precision error
    }

    @Test
    public void testConvertMilesToCash() {
        // Create a RewardValue with a miles value of 10,000 miles
        RewardValue rewardValue = new RewardValue(10000);
        
        // Check if the cash value is correctly converted
        // 10,000 miles should be equivalent to $35.00 (10000 * 0.0035)
        double expectedCash = 10000 * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // Allowing small precision error
    }
}

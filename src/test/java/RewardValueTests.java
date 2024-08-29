import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void testCashToMilesConversion() {
        // Given a cash value of $100.00
        double cashValue = 100.0;

        // When creating a RewardValue with cash value
        RewardValue rewardValue = new RewardValue(cashValue);

        // Then the miles value should be 100 / 0.0035
        int expectedMilesValue = (int) (cashValue / 0.0035);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 
                     "Conversion from cash to miles is incorrect.");
    }

    @Test
    public void testMilesToCashConversion() {
        // Given a miles value of 28571 miles
        int milesValue = 28571;

        // When creating a RewardValue with miles value
        RewardValue rewardValue = new RewardValue(milesValue);

        // Then the cash value should be 28571 * 0.0035
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001, 
                     "Conversion from miles to cash is incorrect.");
    }
}

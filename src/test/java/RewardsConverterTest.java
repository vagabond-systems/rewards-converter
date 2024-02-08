import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RewardsConverterTest {
    @Test
    public void testCashToMilesConversion() {
        double cashValue = 100.0;
        RewardValue reward = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        assertEquals(expectedMilesValue, reward.getMilesValue(), 0.001); // Using a delta for double comparison
    }
    @Test
    public void testMilesToCashConversion() {
        // Test the ability to convert from miles to cash
        double milesValue = 500.0;
        RewardValue reward = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, reward.getCashValue(), 0.001); // Using a delta for double comparison
    }

}
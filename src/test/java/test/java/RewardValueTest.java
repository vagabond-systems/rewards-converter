package test.java; // Adjust this according to your package structure

import main.java.RewardValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTest {

    @Test
    public void testCashToMilesConversion() {
        // Given a cash value
        double cashValue = 350.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When converting to miles
        double expectedMiles = cashValue / 0.0035;

        // Then the miles value should be correct
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    public void testMilesToCashConversion() {
        // Given a miles value
        double milesValue = 1000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);

        // When converting to cash
        double expectedCash = milesValue * 0.0035;

        // Then the cash value should be correct
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01);
    }

    @Test
    public void testMilesToCashConversionNegative() {
        // Given a negative miles value
        double milesValue = -1000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);

        // When converting to cash
        double expectedCash = milesValue * 0.0035;

        // Then the cash value should be correct
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01);
    }
}


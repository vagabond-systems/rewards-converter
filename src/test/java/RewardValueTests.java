import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    // Test the conversion from cash to miles
    @Test
    public void testCashToMilesConversion() {
        // Arrange
        double cashValue = 100.0;  // Sample cash value
        RewardValue rewardValue = new RewardValue(cashValue);

        // Act
        double miles = rewardValue.getMilesValue();

        // Assert
        double expectedMiles = cashValue / 0.0035;  // As per conversion rate 1 mile = 0.0035 USD
        assertEquals(expectedMiles, miles, "Cash to Miles conversion failed");
    }

    // Test the conversion from miles to cash
    @Test
    public void testMilesToCashConversion() {
        // Arrange
        int milesValue = 10000;  // Sample miles value
        RewardValue rewardValue = new RewardValue(milesValue);

        // Act
        double cash = rewardValue.getCashValue();

        // Assert
        double expectedCash = milesValue * 0.0035;  // As per conversion rate 1 mile = 0.0035 USD
        assertEquals(expectedCash, cash, "Miles to Cash conversion failed");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    public void testCashToMilesConversion() {
        // Given
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When
        double expectedMilesValue = cashValue / 0.0035;
        double actualMilesValue = rewardValue.getMilesValue();

        // Then
        assertEquals(expectedMilesValue, actualMilesValue, 0.001); // Using delta for double comparison
    }

    @Test
    public void testGetCashValue() {
        // Given
        double cashValue = 50.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When
        double actualCashValue = rewardValue.getCashValue();

        // Then
        assertEquals(cashValue, actualCashValue, 0.001);
    }

    @Test
    public void testGetMilesValue() {
        // Given
        double cashValue = 75.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When
        double actualMilesValue = rewardValue.getMilesValue();

        // Then
        double expectedMilesValue = cashValue / 0.0035;
        assertEquals(expectedMilesValue, actualMilesValue, 0.001);
    }

    @Test
    public void testConstructorWithZeroCashValue() {
        // Given
        double cashValue = 0.0;

        // When
        RewardValue rewardValue = new RewardValue(cashValue);

        // Then
        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
        assertEquals(0.0, rewardValue.getMilesValue(), 0.001);
    }

    // Add more tests as needed for different scenarios

}





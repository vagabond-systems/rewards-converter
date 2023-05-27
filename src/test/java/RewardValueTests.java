// Made By Iolo Evans Jones for Forage's J.P Morgan & Chase's online work experience
// Import the required packages for testing
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Declare the test class
public class RewardValueTests {

    // This test checks if miles can be correctly converted to cash
    @Test
    void convert_from_miles_to_cash() {
        // Define a miles value
        int milesValue = 10000;

        // Calculate the expected cash value based on the miles value and conversion rate
        double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;

        // Create a new RewardValue object using the miles value
        var rewardValue = new RewardValue(milesValue);

        // Assert that the calculated cash value of the RewardValue object is equal to the expected cash value
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }

    // This test checks if a RewardValue object can be created correctly with a miles value
    @Test
    void create_with_miles_value() {
        // Define a miles value
        int milesValue = 10000;

        // Create a new RewardValue object using the miles value
        var rewardValue = new RewardValue(milesValue);

        // Assert that the miles value of the created RewardValue object is equal to the defined miles value
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    // This test checks if a RewardValue object can be created correctly with a cash value
    @Test
    void create_with_cash_value() {
        // Define a cash value
        double cashValue = 100;

        // Create a new RewardValue object using the cash value
        var rewardValue = new RewardValue(cashValue);

        // Assert that the cash value of the created RewardValue object is equal to the defined cash value
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    // This test checks if cash can be correctly converted to miles
    @Test
    void convert_from_cash_to_miles() {
        // Define a cash value
        double cashValue = 100;

        // Calculate the expected miles value based on the cash value and conversion rate
        int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);

        // Create a new RewardValue object using the cash value
        var rewardValue = new RewardValue(cashValue);

        // Assert that the calculated miles value of the RewardValue object is equal to the expected miles value
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }
}

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
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
    @Test
public void testCashToMilesConversion() {
    // Create a RewardValue instance with a cash value
    RewardValue rewardValue = new RewardValue(100.0);
    
    // Calculate the expected miles value based on the conversion rate
    double expectedMilesValue = 100.0 / 0.0035;
    
    // Check if the calculated miles value matches the actual miles value
    assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.001); // Provide a delta for tolerance
}
@Test
public void testMilesToCashConversion() {
    // Create a RewardValue instance with a miles value
    RewardValue rewardValue = new RewardValue(5000.0, true); // Set the second parameter to true to indicate miles
    
    // Calculate the expected cash value based on the conversion rate
    double expectedCashValue = 5000.0 * 0.0035;
    
    // Check if the calculated cash value matches the actual cash value
    assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001); // Provide a delta for tolerance
}

}

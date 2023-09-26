import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue  rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue  rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0; // Example cash value
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.0001); // Check if cash value is set correctly
        assertEquals(0, rewardValue.getMilesValue()); // Miles value should be initialized to 0
    }  
       

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000; // Example miles value
        double expectedCashValue = milesValue * 0.0035;
        RewardValue rewardValue = new RewardValue(milesValue);
        double actualCashValue = rewardValue.getCashValue(); // Get the cash value from the function
        assertEquals(expectedCashValue, actualCashValue, 0.0001); // Check if cash value matches the expected value
        assertEquals(milesValue, rewardValue.getMilesValue()); // Miles value should be set correctly
    }
}

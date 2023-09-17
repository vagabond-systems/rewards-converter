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
        // Create a RewardValue object with a known cash value 
        double cash = 3.50;
        RewardValue reward = new RewardValue(cash);
        //Based on the known conversion rate - expected miles value
        int expectedMilesValue = 1000;
        //Check if converted miles value matches the expected 
        assertEquals(expectedMilesValue, reward.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
         // Create a RewardValue object with a known miles value 
        int miles = 1000;
        RewardValue reward = new RewardValue(miles);
        //Based on the known conversion rate - expected cash value
        double expectedCashValue = 3.50;
        //Check if converted cash value matches the expected 
        assertEquals(expectedCashValue, reward.getCashValue());
    }
}

import main.java.RewardValue;
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
        assertEquals(milesValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        
        double cashValue = 350.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // When converting to miles
        double expectedMiles = cashValue / 0.0035;

        // Then the miles value should be correct
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01);
    }


    @Test
    void convert_from_miles_to_cash() {
        // Given a miles value
        double milesValue = 1000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true);

        // When converting to cash
        double expectedCash = milesValue * 0.0035;

        // Then the cash value should be correct
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01);
    }
}

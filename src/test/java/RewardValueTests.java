import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.RewardValue;

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

    //Test decorator
//void [name]
//create an instance of the class and pass true
//does the return match the expected ("delta" allows for small differences)

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200; // Change cash value for testing
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue / 0.0035, rewardValue.getMilesValue(), 0.001); // Check conversion with a delta
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000; // Change miles value for testing
        var rewardValue = new RewardValue(milesValue, true); // Pass 'true' to indicate miles value
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue(), 0.001); // Check conversion with a delta
    }
}

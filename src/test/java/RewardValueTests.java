import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

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
    void create_with_negative_miles_value_throws_IllegalArgumentException() {
        int milesValue = -10000;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                                var rewardValue = new RewardValue(milesValue);
                              });

        String expectedMessage = "Miles value must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void create_with_negative_cash_value_throws_IllegalArgumentException() {
        double cashValue = -100;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            var rewardValue = new RewardValue(cashValue);
        });

        String expectedMessage = "Cash value must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int expectedMiles = 28571;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCash = 35.00;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }

}

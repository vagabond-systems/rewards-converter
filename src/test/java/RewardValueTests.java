import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    @DisplayName("Receiving cash value")
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    @DisplayName("Receiving miles")
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    @DisplayName("Convert from cash value to miles")
    void convert_from_cash_to_miles() {

        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / 0.0035);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    @DisplayName("Convert from miles to cash value")
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double expectedValue = (milesValue * 0.0035);
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedValue, rewardValue.covertToCash(milesValue));
    }
}
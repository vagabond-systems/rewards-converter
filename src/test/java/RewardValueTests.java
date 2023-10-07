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
        // Given
        double cashValue = 200;
        final double CONVERSION_RATE=0.0035;

        // When
        int milesValue = (int) (cashValue * CONVERSION_RATE);

        // Then
        assertEquals(0, milesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        // Given
        int milesValue = 35_000;
        final double CONVERSION_RATE=0.0035;

        // When
        double cashValue = milesValue / CONVERSION_RATE;

        // Then
        assertEquals(10_000_000, cashValue);
    }
}

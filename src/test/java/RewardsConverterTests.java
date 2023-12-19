import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class RewardsConverterTests {

    // Test for converting a valid cash value to miles
    @Test
    void convertCashToMiles_WithValidInput_ShouldReturnCorrectMiles() {
        double cashValue = 100.0;
        BigDecimal expectedMiles = calculateExpectedMiles(cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001,
                "Conversion from cash to miles should be accurate for valid input.");
    }

    // Test for converting a negative cash value to miles
    @Test
    void convertCashToMiles_WithNegativeInput_ShouldThrowIllegalArgumentException() {
        double cashValue = -100.0;
        assertThrows(IllegalArgumentException.class,
                () -> RewardsConverter.convertCashToMiles(cashValue),
                "Negative cash values should throw IllegalArgumentException.");
    }

    // Test for converting zero cash value to miles
    @Test
    void convertCashToMiles_WithZeroInput_ShouldReturnZeroMiles() {
        double cashValue = 0.0;
        BigDecimal expectedMiles = calculateExpectedMiles(cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001,
                "Conversion from zero cash to miles should return zero miles.");
    }

    // Test for converting the smallest possible positive cash value to miles
    @Test
    void convertCashToMiles_WithMinimalInput_ShouldReturnMinimalMiles() {
        double cashValue = Double.MIN_VALUE;
        BigDecimal expectedMiles = calculateExpectedMiles(cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001,
                "Conversion from minimal cash to miles should be accurate.");
    }

    // Helper method to calculate expected miles
    private BigDecimal calculateExpectedMiles(double cashValue) {
        return BigDecimal.valueOf(RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE * cashValue);
    }
}

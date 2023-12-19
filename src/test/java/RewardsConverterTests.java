import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class RewardsConverterTests {

    @Test
    void convertCashToMiles_withValidInput() {
        double cashValue = 100.0;
        BigDecimal expectedMiles = BigDecimal.valueOf(RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE * cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001, "The conversion from cash to miles should match the expected value.");
    }


    @Test
    void convertCashToMiles_withNegativeInput() {
        double cashValue = -100.0;
        assertThrows(IllegalArgumentException.class, () -> RewardsConverter.convertCashToMiles(cashValue), "Negative cash values should throw IllegalArgumentException.");
    }

    @Test
    void convertCashToMiles_withZeroInput() {
        double cashValue = 0.0;
        BigDecimal expectedMiles = BigDecimal.valueOf(RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE * cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001, "The conversion from cash to miles should match the expected value.");
    }

    @Test
    void convertCashToMiles_withMinInput() {
        double cashValue = Double.MIN_VALUE;
        BigDecimal expectedMiles = BigDecimal.valueOf(RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE * cashValue);
        BigDecimal actualMiles = RewardsConverter.convertCashToMiles(cashValue);

        assertEquals(expectedMiles.doubleValue(), actualMiles.doubleValue(), 0.0001, "The conversion from cash to miles should match the expected value.");
    }



}

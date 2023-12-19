import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    // Tests for constructor with cash value
    @Test
    void createRewardValue_withValidCashValue_shouldCorrectlySetCashValue() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue().doubleValue(),
                "Cash value should be set correctly in constructor.");
    }

    // Tests for constructor with mile value
    @Test
    void createRewardValue_withValidMilesValue_shouldCorrectlySetMilesValue() {
        double milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue().doubleValue(),
                "Miles value should be set correctly in constructor.");
    }

    // Tests for conversion from cash to miles
    @Test
    void convertCashToMiles_withValidCashValue_shouldReturnCorrectMiles() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue * RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue().doubleValue(), 0.01,
                "Conversion from cash to miles should be accurate.");
    }

    // Tests for conversion from miles to cash
    @Test
    void convertMilesToCash_withValidMilesValue_shouldReturnCorrectCash() {
        double milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = 35.0;
        assertEquals(expectedCash, rewardValue.getCashValue().doubleValue(),
                "Conversion from miles to cash should be accurate.");
    }

    // Tests for invalid negative cash value
    @Test
    void createRewardValue_withNegativeCashValue_shouldThrowIllegalArgumentException() {
        double negativeCashValue = -100;
        assertThrows(IllegalArgumentException.class, () -> new RewardValue(negativeCashValue),
                "Constructor should throw IllegalArgumentException for negative cash value.");
    }

    // Tests for invalid negative miles value
    @Test
    void createRewardValue_withNegativeMilesValue_shouldThrowIllegalArgumentException() {
        double negativeMilesValue = -10000;
        assertThrows(IllegalArgumentException.class, () -> new RewardValue(negativeMilesValue, true),
                "Constructor should throw IllegalArgumentException for negative miles value.");
    }
}

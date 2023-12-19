import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue().doubleValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue().doubleValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue * RewardValue.DEFAULT_CASH_TO_MILES_CONVERSION_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue().doubleValue(), 0.01, "The conversion from cash to miles should match the expected value.");
    }



    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        double expectedCash = 35.0;
        assertEquals(expectedCash, rewardValue.getCashValue().doubleValue());
    }

    @Test
    void invalid_negative_cash_value_throws_exception() {
        double negativeCashValue = -100;
        assertThrows(IllegalArgumentException.class, () -> new RewardValue(negativeCashValue));
    }

    @Test
    void invalid_negative_miles_value_throws_exception() {
        double negativeMilesValue = -10000;
        assertThrows(IllegalArgumentException.class, () -> new RewardValue(negativeMilesValue, true));
    }

}

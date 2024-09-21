import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {
    private static final double MILES_TO_CASH_RATE = 0.01; // Example conversion rate

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value should match the input cash value.");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value should match the input miles value.");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000.0;
        int expectedMiles = (int) (cashValue / MILES_TO_CASH_RATE);
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue(),
                "Conversion from cash to miles should be correct.");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double expectedCash = milesValue * MILES_TO_CASH_RATE;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue(),
                "Conversion from miles to cash should be correct.");
    }
}


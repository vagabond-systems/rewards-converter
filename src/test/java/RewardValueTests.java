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
        double cashValue = 100; // $100
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; // Convert $100 to miles
        double delta = 0.1; // Allowing a slightly larger margin for floating-point precision
        assertEquals(expectedMiles, rewardValue.getMilesValue(), delta);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // 10,000 miles
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035; // Convert 10,000 miles to dollars
        double delta = 0.01; // Small tolerance for floating-point precision
        assertEquals(expectedCash, rewardValue.getCashValue(), delta);
    }
}

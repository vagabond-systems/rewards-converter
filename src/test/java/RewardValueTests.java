import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

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
        //Arrange - Create expected result, RewardValue instance
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);

        //Assert - test that rewardValue miles matches expected value
        int expectedValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        assertEquals(expectedValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        //Arrange - Create expected result, RewardValue instance
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);

        //Assert - test that rewardValue miles matches expected value
        double expectedValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedValue, rewardValue.getCashValue());
    }
}

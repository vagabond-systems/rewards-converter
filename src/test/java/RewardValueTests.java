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

        double cashValue = 50;
        var rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int) (cashValue / 0.0035);

        int actualMiles = rewardValue.getMilesValue();

        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;

        // Act
        double actualCash = rewardValue.getCashValue();

        // Assert
        assertEquals(expectedCash, actualCash, 0.001);
    }
}

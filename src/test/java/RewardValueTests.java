import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        // Arrange
        double cashValue = 100.00;
        int expectedMilesValue = 28571;

        // Act
        var rewardValue = new RewardValue(cashValue);
        int actualMilesValue = rewardValue.convertToMiles(rewardValue.getCashValue());

        // Assert
        assertEquals(expectedMilesValue , actualMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        // Arrange
        int milesValue = 100;
        double expectedCashValue = 0.35;

        // Act
        var rewardValue = new RewardValue(milesValue);
        double actualCashValue = rewardValue.getCashValue();

        // Assert
        assertEquals(expectedCashValue, actualCashValue, 2);
    }
}

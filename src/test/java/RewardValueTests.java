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
        // Arrange
        RewardValue rewardValue = new RewardValue(50.0); // Assuming $50 cash value

        // Act
        rewardValue.convertCashToMiles();

        // Assert
        int expectedMilesValue = 14285; // Adjust this based on the expected result
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        // Arrange
        RewardValue rewardValue = new RewardValue(1000); // Assuming 1000 miles

        // Act
        rewardValue.convertMilesToCash();

        // Assert
        double expectedCashValue = 3.5; // Adjust this based on the expected result
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01); // Using delta for double comparison
    }
}


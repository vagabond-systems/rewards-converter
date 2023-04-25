import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RewardValueTests {
    private final double Airline = 0.001;
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

        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double milesValue = rewardValue.getMilesValue();
        assertFalse(Math.abs(cashValue / 0.0035 - milesValue) > Airline);

    }

    @Test
    void convert_from_miles_to_cash()   {     int milesValue = 10000;
    RewardValue rewardValue = new RewardValue(milesValue);

    // Act
    double cashValue = rewardValue.getCashValue();

    // Assert
    assertFalse(Math.abs(milesValue * 0.0035 - cashValue) > Airline);
    }
}

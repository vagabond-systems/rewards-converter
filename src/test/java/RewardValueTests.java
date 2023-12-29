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
        double cashValue = 100;
        int expectedMilesValue = 10000; // Assuming 1 cashValue = 100 miles
        var rewardValue = new RewardValue(cashValue);

        int convertedMilesValue = rewardValue.convertFromCashToMiles();
        assertEquals(expectedMilesValue, convertedMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = 100; // Assuming 100 miles = 1 cashValue
        var rewardValue = new RewardValue(milesValue);

        double convertedCashValue = rewardValue.convertFromMilesToCash();
        assertEquals(expectedCashValue, convertedCashValue);
    }
}


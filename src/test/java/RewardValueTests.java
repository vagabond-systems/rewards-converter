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
        double cashValue = 100.0;
        double expectedMiles = 1000.0;  // Adjust this based on your conversion rate

        var rewardValue = new RewardValue(cashValue);

        double actualMiles = rewardValue.convertCashToMiles();

        assertEquals(expectedMiles, actualMiles, 0.01);  // Adjust delta based on your precision
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;  // Adjust this based on your conversion rate
        double expectedCashValue = 100.0;

        var rewardValue = new RewardValue(milesValue);

        double actualCashValue = rewardValue.convertMilesToCash();

        assertEquals(expectedCashValue, actualCashValue, 0.01);  // Adjust delta based on your precision
    }
}

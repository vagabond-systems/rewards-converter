import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
        assertEquals(cashValue * 100, rewardValue.getMilesValue()); // 1 dollar = 100 miles
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue(), 0.0001); // 1 mile = 0.0035 dollars
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0; // 100 dollars
        double expectedMiles = cashValue * 100; // Assuming 1 dollar = 100 miles
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // 10,000 miles
        double expectedCash = milesValue * 0.0035; // Assuming 1 mile = 0.0035 dollars
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001); // Tolerance for floating point comparison
    }
}

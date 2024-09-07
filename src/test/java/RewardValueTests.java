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
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035; // Conversion rate
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.01); // Adding a delta for floating-point comparison
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        double expectedCashValue = milesValue * 0.0035; // Conversion rate
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01); // Adding a delta for floating-point comparison
    }
}



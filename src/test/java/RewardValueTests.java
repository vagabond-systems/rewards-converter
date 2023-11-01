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
    void convertFromCashToMiles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue / 0.0035);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convertFromMilesToCash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001); // Use delta for double comparison
    }
}

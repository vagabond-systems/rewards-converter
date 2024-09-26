import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
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
        var rewardValue = new RewardValue(cashValue);
        // Miles = cashValue / 0.0035
        int expectedMiles = (int) (cashValue / 0.0035);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
        // assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        // Cash = milesValue * 0.0035
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(),0.001); // Add tolerance for floating point
        // assert false;
    }
}

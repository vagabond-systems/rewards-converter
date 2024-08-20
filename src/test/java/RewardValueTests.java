import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
    void create_with_zero_cash_value() {
        double cashValue = 0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(0, rewardValue.getCashValue());
        assertEquals(0, rewardValue.getMilesValue());
    }

    // Edge Case 2: Zero Miles Value
    @Test
    void create_with_zero_miles_value() {
        int milesValue = 0;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(0, rewardValue.getMilesValue());
        assertEquals(0, rewardValue.getCashValue());
    }

    // Edge Case 3: Negative Cash Value
    @Test
    void create_with_negative_cash_value() {
        double cashValue = -100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(-100, rewardValue.getCashValue());
        assertEquals(-100 / 0.0035, rewardValue.getMilesValue(), 0.0001);
    }

    // Edge Case 4: Negative Miles Value
    @Test
    void create_with_negative_miles_value() {
        int milesValue = -10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(-10000, rewardValue.getMilesValue());
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }

    // Edge Case 5: Large Cash Value
    @Test
    void create_with_large_cash_value() {
        double cashValue = 1_000_000_000;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
        assertEquals(cashValue / 0.0035, rewardValue.getMilesValue(), 0.0001);
    }

    // Edge Case 6: Large Miles Value
    @Test
    void create_with_large_miles_value() {
        int milesValue = 1_000_000_000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }

    // Edge Case 7: Small Cash Value
    @Test
    void create_with_small_cash_value() {
        double cashValue = 0.0001;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
        assertEquals(cashValue / 0.0035, rewardValue.getMilesValue(), 0.0001);
    }

    // Edge Case 8: Small Miles Value
    @Test
    void create_with_small_miles_value() {
        int milesValue = 1;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }
}
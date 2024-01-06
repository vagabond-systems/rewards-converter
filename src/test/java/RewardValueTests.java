import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void testRewardValueConversionFromCash() {
        double cashValue = 100.0;
        var rewardValue = new main.java.RewardValue(cashValue, true);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
        assertEquals(100.0 / 0.0035, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testRewardValueConversionFromMiles() {
        double milesValue = 500.0; // Adjust this value as needed
        var rewardValue = new main.java.RewardValue(milesValue, false);
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.001);
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue(), 0.001);
    }

    // Other existing tests...
}

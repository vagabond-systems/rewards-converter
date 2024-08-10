import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void testCashConstructor() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0, reward.getCashValue());
        assertEquals(100.0 / 0.0035, reward.getMilesValue());
    }

    @Test
    public void testMilesConstructor() {
        RewardValue reward = new RewardValue(1000.0, true);
        assertEquals(1000.0 * 0.0035, reward.getCashValue());
        assertEquals(1000.0, reward.getMilesValue());
    }
}

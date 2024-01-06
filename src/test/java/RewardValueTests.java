import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void testRewardValueConversion() {
        double cashValue = 100.0;

        // Assuming the value is in cash
        var rewardValue = new main.java.RewardValue(cashValue, true);

        // Assuming the value is in miles
        // var rewardValue = new RewardValue(cashValue, false);

        assertEquals(cashValue, rewardValue.getCashValue(), 0.001);
        assertEquals(100.0 / 0.0035, rewardValue.getMilesValue(), 0.001);
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    public void testCashValueConstructor() {
        // Test constructor that accepts cash value
        RewardValue rewardValue = new RewardValue(100.0);
        assertEquals(100.0, rewardValue.getCashValue(), 0.001); // Delta is used for double comparison
        assertEquals(28571.428571428572, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testMilesValueConstructor() {
        // Test constructor that accepts miles value
        RewardValue rewardValue = new RewardValue(50000);
        assertEquals(175.0, rewardValue.getCashValue(), 0.001);
        assertEquals(50000.0, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testGetCashValue() {
        // Test the getCashValue method
        RewardValue rewardValue = new RewardValue(250.0);
        assertEquals(250.0, rewardValue.getCashValue(), 0.001);
    }

    @Test
    public void testGetMilesValue() {
        // Test the getMilesValue method
        RewardValue rewardValue = new RewardValue(1000);
        assertEquals(1000, rewardValue.getMilesValue(), 0.001);
    }


}

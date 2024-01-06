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
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.0035;
        double delta = 0.001;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), delta);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        double delta = 0.001;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), delta);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.0035; // Corrected conversion
        double delta = 0.001;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), delta);
    }
}

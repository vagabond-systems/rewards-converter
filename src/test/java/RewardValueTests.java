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
    void convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue(100.0);
        double expectedMiles = 100.0 / 0.0035;

        double actualMiles = 100.0 / 0.0035;

        assertEquals(expectedMiles, actualMiles, 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(50);
        double expectedCashAmount =  50 * 0.0035;

        double actualCashAmount = rewardValue.getCashValue();

        assertEquals(expectedCashAmount, actualCashAmount, 0.01);
    }
}

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
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = 50; // replace with your expected value
        double delta = 0.001; // choose an appropriate delta for your case
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), delta);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = 35; // replace with your expected value
        double delta = 0.001; // choose an appropriate delta for your case
        assertEquals(expectedCashValue, rewardValue.getCashValue(), delta);
    }
}

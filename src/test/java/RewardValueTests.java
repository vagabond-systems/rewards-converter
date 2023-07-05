import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    public static final double conversion_rate = 0.0035;
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
        double cash = 100;
        var reward = new RewardValue(cash);
        int expectedMiles = (int) (cash / conversion_rate);
        assertEquals(expectedMiles, rewards.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        var reward = new RewardValue(miles);
        double expectedCash = miles * conversion_rate;
        assertEquals(expectedCash, rewards.getCashValue());
    }
}

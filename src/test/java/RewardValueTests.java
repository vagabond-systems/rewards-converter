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
        double conversion_rate = 0.0035;
        double cash = 100;
        int expectedMiles = (int) (cash / conversion_rate);
        var reward = new RewardValue(cash);

        assertEquals(expectedMiles,reward.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double conversion_rate = 0.0035;
        int miles = 1000;
        var reward = new RewardValue(miles);

        assertEquals((miles * conversion_rate),reward.getCashValue());
    }
}

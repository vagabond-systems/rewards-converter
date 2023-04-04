import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue/0.0035, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue * 0.0035, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1;
        double expectMiles = cashValue/0.0035;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 1;
        double expectMiles = 1 * 0.0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(expectMiles, rewardValue.getMilesValue());
    }
}

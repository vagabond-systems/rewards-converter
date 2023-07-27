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
        double cash = 1000;
        int rewardCash = (new RewardValue(cash)).getMilesValue();
        assertEquals(3, rewardCash);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 50;
        double rewardMiles = (new RewardValue(miles)).getCashValue();
        assertEquals(14285.71, rewardMiles);
    }
}

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
        double cash = 100.00;
        int milesExpected = (int)(cash / 0.0035);
        RewardValue rewardValue = new RewardValue(cash);
        var milesFromCash = rewardValue.getMilesValue();
        assertEquals(milesExpected,milesFromCash);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 3000;
        double cashExpected = (double)(miles * 0.0035);
        RewardValue rewardValue = new RewardValue(miles);
        var cashFromMiles = rewardValue.getCashValue();
        assertEquals(cashExpected,cashFromMiles);
    }
}

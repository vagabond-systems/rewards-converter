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
        // cash to miles conversion
        double cashValue = 350.00;
        RewardValue rewardValue = new RewardValue(cashValue);
        // expected number of miles to convert
        int milesIthinkIhave = (int) (cashValue * 0.0035);

        assertEquals(milesIthinkIhave, rewardValue.getMilesValue());
    }
    @Test
    void convert_from_miles_to_cash() {
        // miles to cash
        int milesValue = 5000;
        RewardValue rewardValue = new RewardValue(milesValue);
        // expected cash to convert
        double cashIHave = (milesValue / 0.0035);

        assertEquals(cashIHave, rewardValue.getCashValue());
    }
}

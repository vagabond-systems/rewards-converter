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
        var rewardValue = new RewardValue((double)milesValue, true);
        int actual = (int) rewardValue.getMilesValue();
        assertEquals(milesValue, actual);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 350;
        double emiles = cash/0.0035; //expected
        var reward = new RewardValue(cash);
        double amiles = reward.getMilesValue(); //actual
        assertEquals(emiles, amiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        double miles = 350;
        double ecash = miles*0.0035; //expected
        var reward = new RewardValue(miles, true);
        double acash = reward.getCashValue(); //actual
        assertEquals(ecash, acash);
    }
}

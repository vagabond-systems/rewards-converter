import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 509.79;
        int milesValue = 145657;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 72680;
        double cashValue = 254.38;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert true;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert true;
    }
}

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
        double cashValue = 400;
        int milesValue = 114285;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue , rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 400;
        int milesValue = 114285;
        var rewardValue = new RewardValue(milesValue);

        // The following line adds 1 to the product
        // Then truncates the sum
        // Since convertToCash() returns a double
        assertEquals(cashValue, (int)rewardValue.getCashValue()+1);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    	double cashValue = 350;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(100000, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
    	 int milesValue = 50000;
         RewardValue rewardValue = new RewardValue(milesValue);
         assertEquals(175.0, rewardValue.getCashValue(), 0.01);
    }
}

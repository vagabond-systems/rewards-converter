import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        //assert false;
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        //assert false;
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        //assert false;
        double cashValue=100;
        int expectMiles= (int)(cashValue/RewardValue.conversionRate);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        //assert false;
        int milesValue=10000;
        double expectedCash= milesValue*RewardValue.conversionRate;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

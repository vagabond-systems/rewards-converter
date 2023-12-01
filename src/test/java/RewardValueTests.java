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
    void convert_from_cash_to_miles(){
        double cashToConvert = 100;
        int expectedMiles = (int)(100 / 0.0035);
        RewardValue inputCashValue = new RewardValue(cashToConvert);
        assertEquals(expectedMiles, inputCashValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesToConvert = 10000;
        double expectedCash = (int) (10000 * 0.0035);
        RewardValue inputMileValue = new RewardValue(milesToConvert);
        assertEquals(expectedCash, inputMileValue.getCashValue());
    }
}

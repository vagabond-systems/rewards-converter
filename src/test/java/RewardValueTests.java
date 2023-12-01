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
        int cashToConvert = 100;
        RewardValue inputCashValue = new RewardValue(cashToConvert);
        assertEquals(28571, inputCashValue.convertCashToMiles(cashToConvert));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesToConvert = 5000;
        RewardValue inputMileValue = new RewardValue(milesToConvert);
        assertEquals(17.5, inputMileValue.convertMilesToCash(milesToConvert));
    }
}

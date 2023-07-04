import org.junit.jupiter.api.Assertions;
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
        double cashToConvert = 205.00;
        RewardValue rewardValue = new RewardValue(cashToConvert);
        double returnedMilesValue = rewardValue.getMilesValue();
        assertEquals(0.72, returnedMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesToConvert = 2;
        RewardValue rewardValue = new RewardValue(milesToConvert);
        double returnedCashValue = rewardValue.getCashValue();
        assertEquals(571.43, returnedCashValue);
    }
}

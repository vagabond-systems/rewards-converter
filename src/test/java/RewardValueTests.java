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
        int milesExpected = 10000;
        double cashValue = 35.00;
        RewardValue rewardValue = new RewardValue(cashValue);
        int milesActual = rewardValue.getMilesValue();
        assertEquals(milesExpected, milesActual);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double cashExpected = 3.50;
        RewardValue rewardValue = new RewardValue(milesValue);
        double cashActual = rewardValue.getCashValue();
        assertEquals(cashExpected, cashActual);


    }
}

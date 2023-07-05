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
        double cashValue = 100.00;
        double DOLLARS_PER_MILE_EXCHANGE_RATE = 0.0035;
        var rewardValue = new RewardValue(cashValue);
        int milesExpected = (int)(cashValue / DOLLARS_PER_MILE_EXCHANGE_RATE); // expect 28,571
        assertEquals(milesExpected, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double DOLLARS_PER_MILE_EXCHANGE_RATE = 0.0035;
        var rewardValue = new RewardValue(milesValue);
        double cashExpected = (milesValue * DOLLARS_PER_MILE_EXCHANGE_RATE); // expect 35
        assertEquals(cashExpected, rewardValue.getCashValue());
    }
}

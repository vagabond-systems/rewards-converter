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
        double cashValue = 100; // cash value insertion
        int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_EXCHANGE_RATE); // expected miles value equation from rewardvalue class
        var rewardValue = new RewardValue(cashValue); // new reward value
        assertEquals(expectedMilesValue, rewardValue.getMilesValue()); //expected miles value return
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; // miles value insertion
        double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_EXCHANGE_RATE; // expected cash value equation from rewardvalue class
        var rewardValue = new RewardValue(milesValue); // new reward value
        assertEquals(expectedCashValue, rewardValue.getCashValue()); //expected cash value return
    }
}


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
        final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

        double cashValue = 1000;
        int expectedMilesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        System.out.println("expectedMilesValue: " + expectedMilesValue);

        var rewardValue = new RewardValue(cashValue);
        System.out.println("rewardValue.getMilesValue(): " +rewardValue.getMilesValue());

        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

        int miles = 1000;
        double expectedCashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
        System.out.println("expectedCashValue: " + expectedCashValue);


        var rewardValue = new RewardValue(miles);
        System.out.println("rewardValue.getCashValue(): " + rewardValue.getCashValue());

        assertEquals(expectedCashValue , rewardValue.getCashValue());
    }
}




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
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue / RewardValue.CONSTANT_RATE);

        System.out.println("Cash Value: " + cashValue);
        System.out.println("Expected Miles Value: " + expectedMilesValue);
        System.out.println("Actual Miles Value: " + rewardValue.getMilesValue());

        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * RewardValue.CONSTANT_RATE;

        System.out.println("Miles Value: " + milesValue);
        System.out.println("Expected Cash Value: " + expectedCashValue);
        System.out.println("Actual Cash Value: " + rewardValue.getCashValue());

        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
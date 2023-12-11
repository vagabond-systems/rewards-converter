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
        //given
        double cashValue = 100;
        int expectedMilesValue = 28571;

        //when
        RewardValue rewardValue = new RewardValue(cashValue);
        int actualMiles = rewardValue.getMilesValue();

        //then
        assertEquals(expectedMilesValue, actualMiles);
    }


    @Test
    void convert_from_miles_to_cash() {
        //given
        double expectedCashValue = 100;
        double milesValue = 28571;

        //when
        RewardValue rewardValue = new RewardValue(milesValue);
        double actualCash = rewardValue.getCashValue();

        //then
        assertEquals(expectedCashValue, actualCash);
    }
}

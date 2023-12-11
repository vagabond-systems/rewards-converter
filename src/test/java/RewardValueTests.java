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
        double cash = 35;
        double expectedMiles = 10000;
        //when
        RewardValue rewardValue = new RewardValue(cash);
        double actualMiles = rewardValue.getMilesValue();
        //then
        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        //given
        int miles = 10000;
        double expectedCash = 35;
        //when
        RewardValue rewardValue = new RewardValue(miles);
        double actualCash = rewardValue.getCashValue();
        //then
        assertEquals(expectedCash, actualCash);
    }
}

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
        double cashValue = 1000;
        int expectedMiles = (int) (cashValue / 0.0035);
        //when
        RewardValue rewardValue = new RewardValue(cashValue);
        //then
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        //given
        int milesValue = 10000;
        double expectedCash = milesValue * 0.0035;
        //when
        RewardValue rewardValue = new RewardValue(milesValue);
        //then
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

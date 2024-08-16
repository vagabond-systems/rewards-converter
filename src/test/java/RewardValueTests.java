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
        double cash = 50;
        var rewardValue = new RewardValue(cash);
        int ExpectedMiles =  (int) (cash / rewardValue.MilesToCashRate) ;
        assertEquals(ExpectedMiles, rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int Miles = 42857;
        var rewardValue = new RewardValue(Miles);
        double ExpectedCash =  Miles * rewardValue.MilesToCashRate;
        assertEquals(ExpectedCash, rewardValue.getCashValue());
    }
}

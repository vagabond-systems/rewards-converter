import org.junit.jupiter.api.Test;

import java.util.Scanner;

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
        double cash = 10000;
        int desired_miles = (int) (cash / RewardValue.MILES_TO_CASH_RATE );
        RewardValue reward  = new RewardValue(cash);
        assertEquals(reward.getMilesValue(), desired_miles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        double desired_cash = miles * RewardValue.MILES_TO_CASH_RATE;
        RewardValue rewardValue = new RewardValue(miles);
        assertEquals(desired_cash, rewardValue.getCashValue());
    }
}

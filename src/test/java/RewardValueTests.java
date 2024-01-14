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
        double miles_to_cash_conversion_unit = 0.0035;
        double cashValue = 100;
        int milesValue = (int) (cashValue / miles_to_cash_conversion_unit);
        var rewardValueCash = new RewardValue(cashValue);
        var rewardValueMiles = new RewardValue(milesValue);
        assertEquals(rewardValueMiles.milesValue, rewardValueCash.cash_to_miles());
        //assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        double miles_to_cash_conversion_unit = 0.0035;
        int milesValue = 10000;
        double cashValue = (double) milesValue * miles_to_cash_conversion_unit;
        var rewardValueCash = new RewardValue(cashValue);
        var rewardValueMiles = new RewardValue(milesValue);
        assertEquals(rewardValueCash.cashValue, rewardValueMiles.miles_to_cash());
        //assert false;
    }
}

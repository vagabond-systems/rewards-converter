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
        // arrange
        double cashValue = 3590.50;
        double milesValue;
        // act
        milesValue = cashValue * 0.0035;
        var rewardValue = new RewardValue(cashValue);
        // assert
        assertEquals(milesValue, rewardValue.getMilesValue(), "Mismatching values of Miles");
    }

    @Test
    void convert_from_miles_to_cash() {
        // arrange
        int milesValue = 2050;
        double cashValue;
        // act
        cashValue = milesValue / 0.0035;
        var rewardValue = new RewardValue(milesValue);
        // assert
        assertEquals(cashValue, rewardValue.getCashValue(), "Mismatching values of Cash");
    }
}

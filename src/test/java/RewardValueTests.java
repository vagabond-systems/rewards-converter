import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        //GIVEN
        double expected = 100;

        //WHEN
        var rewardValue = new RewardValue(expected);

        //THEN
        assertEquals(expected, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        //GIVEN
        int expected = 10000;

        //WHEN
        var rewardValue = new RewardValue(expected);

        //THEN
        assertEquals(expected, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        //GIVEN
        double cashValue = 3.50;
        int expected = 1000;

        //WHEN
        var rewardValue = new RewardValue(cashValue);

        //THEN
        assertEquals(expected, rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        //GIVEN
        int milesValue = 1000;
        double expected = 3.50;

        //WHEN
        var rewardValue = new RewardValue(milesValue);
        
        //THEN
        assertEquals(expected, rewardValue.getCashValue());
    }

    @Test
    void String_format() {
        //GIVEN
        double cashValue = 3.50;
        String expected = "$3.50 converted to miles is 1000";

        //WHEN
        var rewardValue = new RewardValue(cashValue);
        int milesValue = rewardValue.getMilesValue();

        //THEN
        String actual = String.format("$%.2f converted to miles is %d", cashValue, milesValue);
        assertEquals(expected, actual);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    //The project specification says that you must convert from miles to cash. My reading is that this is a one-way conversion.
    //Therefore, I do not convert cash back into miles when using the cash constructor
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
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}

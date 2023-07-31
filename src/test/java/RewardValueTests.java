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
        int cashvalue = 1000;
        int Milesvalue = (int)(cashvalue/0.0035);
        var rewardValue = new RewardValue(cashvalue);
        assertEquals(Milesvalue,rewardValue.convertToMiles(cashvalue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milevalue = 1000;
        double cashValue = (milevalue * 0.0035);
        var rewardValue = new RewardValue(milevalue);
        assertEquals(cashValue,rewardValue.convertToCash(milevalue));
    }
}

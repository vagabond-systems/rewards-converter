import com.sun.net.httpserver.Request;
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
        double cash = 100.5;
        var rewardValue = new RewardValue(cash);
        int milesTestValue = (int) (cash/0.0035);
        assertEquals(milesTestValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 555;
        var rewardValue = new RewardValue(miles);
        double cashTestValue = miles * 0.0035;
        assertEquals(cashTestValue, rewardValue.getCashValue());
    }
}
